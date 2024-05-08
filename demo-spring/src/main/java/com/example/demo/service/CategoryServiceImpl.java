package com.example.demo.service;

import com.example.demo.dto.CategoryDto;
import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private static final Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);
    @CacheEvict("categories")
    /**
     * sử dụng transaction trên một method save entity và đặt flag readonly = true
     * kết quả trả về 200 nhưng dữ liệu không được lưu xuống db
     * Để false sẽ lưu xuống db
     */
    @Transactional(readOnly = false,propagation = Propagation.REQUIRED)
    @Override
    public Category createCategory(CategoryDto categoryDto) {
        Category category = Category.builder().name(categoryDto.getName()).build();
        logger.info("create category");
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(int id) {

        categoryRepository.deleteById(id);

    }

    @Cacheable("categories")
    @Override
    @Transactional
    public List<Category> getCategories() {

        logger.info("No cache");
        return categoryRepository.findAll();
    }

    @Cacheable("category")
    @Override
    @Transactional
    public Category getCategory(int id) {
        List<Product> products = productRepository.getProductByCategoryId(id);

        Category category = categoryRepository.findById(id).orElse(null);

        category.setProducts(products);

        return category;
    }

    @CachePut("category")
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Category updateCategory(int id, CategoryDto categoryDto) {

            Category category = categoryRepository.getReferenceById(id);
            category.setName(categoryDto.getName());
            return categoryRepository.save(category);

    }
}
