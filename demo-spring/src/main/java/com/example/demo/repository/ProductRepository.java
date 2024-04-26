package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    /**
     * query creation là một tính năng của spring data jpa có thể sinh ra câu lệnh truy vấn db từ tên
     * của method
     * @param id: id category
     * @return
     */
    List<Product> findByCategoryId(String id);


    /**
     * @query ngôn ngữ truy vấn db của jpa có thể truy vấn dựa trên entity
     * @param price
     * @return
     */
    @Query("SELECT p FROM Product p WHERE p.price > :price")
    List<Product> findByPrice(int price);
}
