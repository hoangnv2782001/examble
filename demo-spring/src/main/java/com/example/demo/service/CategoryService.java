package com.example.demo.service;

import com.example.demo.dto.CategoryDto;
import com.example.demo.model.Category;

import java.util.List;

public interface CategoryService {

    void createCategory(CategoryDto categoryDto);

    void deleteCategory(int id);

    List<Category> getCategories();

    Category getCategory(int id);

    Category updateCategory(int id,CategoryDto categoryDto);
}
