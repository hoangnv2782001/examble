package com.example.demo.repository;

import com.example.demo.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Repository
/**
 * khi đặt là readonly = true nhưng ở outer scope đăặt propagation = required thì sẻ sử dụng các thuộc
 * tính của outer scope là read only = false
 */
@Transactional(readOnly = true)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
