package com.example.demo;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;


    @Test
    @Order(1)
    public void createCategoryTest() {

        Category category = Category.builder()
                .name("hoang 123")
                .build();

        categoryRepository.save(category);

        assertThat(category).isNotNull();
    }

    @Test
    @Order(2)
    public void getCategoryTest() {

        int categoryId = 1;

        Category category = categoryRepository.findById(1).get();

        assertThat(category).isNotNull();
    }

    @Test
    @Order(3)
    public void getAllCategoriesTest() {

        List<Category> categories = categoryRepository.findAll();

        assertThat(categories.size()).isGreaterThan(0);
    }



    @Test
    @Order(4)
    public void updateCategoryTest() {

       Category category = categoryRepository.getReferenceById(1);

       category.setName("Hoang dep trai");

       Category categorySaved = categoryRepository.save(category);

       assertThat(categorySaved.getName()).isEqualTo(category.getName());
    }
}
