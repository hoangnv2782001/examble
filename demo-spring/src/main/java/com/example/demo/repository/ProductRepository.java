package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    /**
     * query creation là một tính năng của spring data jpa có thể sinh ra câu lệnh truy vấn db từ tên
     * của method
     * @param id: id category
     * @return
     */
    List<Product> findByCategoryId(int id);


    /**
     * @query ngôn ngữ truy vấn db của jpa có thể truy vấn dựa trên entity
     * @param price
     * @return
     */
    @Query("SELECT p FROM Product p WHERE p.price > :price")
    List<Product> findByPrice(int price);


    /**
     * khi đặt là nerver thì method không được gọi trong một transaction nếu không sẽ ném ra một exception
     * @param id
     * @return
     */
    @Transactional(propagation = Propagation.NEVER)
    List<Product> getProductByCategoryId(int id);

    /**
     * kiểm tra nếu có exception thì sử dụng không có thì thôi
     * @return
     */
    @Transactional(propagation = Propagation.SUPPORTS)
    @Query("SELECT p FROM Product p where p.price > 10")
    Product getProductByPrice();

    /**
     * nếu có sử dụng transaction không có thì throw exception
     * @param name
     * @return
     */
    @Transactional(propagation = Propagation.MANDATORY)
    List<Product> getProductByName(String name);

    /**
     * bỏ qua transaction thực thi không cần transaction
     * @param id
     * @return
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    List<Product> getProduct(int id);
}
