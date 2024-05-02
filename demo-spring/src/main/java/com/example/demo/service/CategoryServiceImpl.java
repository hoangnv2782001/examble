package com.example.demo.service;

import com.example.demo.dto.CategoryDto;
import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;
    private static final Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);
    @CacheEvict("categories")
    @Override
    public void createCategory(CategoryDto categoryDto) {
        Category category = Category.builder().name(categoryDto.getName()).build();
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(int id) {

        categoryRepository.deleteById(id);

    }

    @Cacheable("categories")
    @Override
    public List<Category> getCategories() {

        logger.info("No cache");
        return categoryRepository.findAll();
    }

    @Cacheable("category")
    @Override
    public Category getCategory(int id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @CachePut("category")
    @Override
    public Category updateCategory(int id, CategoryDto categoryDto) {
        Category category = categoryRepository.getReferenceById(id);
        category.setName(categoryDto.getName());
        return categoryRepository.save(category);
    }
}
