package com.example.demo;


import com.example.demo.dto.CategoryDto;
import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CategoryServiceTest {

    @Mock
    private CategoryRepository categoryRepository;

    @InjectMocks
    private CategoryServiceImpl categoryService;


    @DisplayName("Create category")
    @Test
    public void giveCategoryDto_whenCreateCategory_thenReturnCategoryObject(){

        //given

        CategoryDto categoryDto = CategoryDto.builder().name("hoang123").build();

        Category category = Category.builder().name(categoryDto.getName()).build();

        given(categoryRepository.save(any(Category.class))).willReturn(category);
        //when

        Category categorySaved = categoryService.createCategory(categoryDto);

        System.out.println(category);
        //then

        assertThat(categorySaved).isNotNull();
    }

    @DisplayName("delete category")
    @Test
    public void givenCategoryId_whenDeleteCategoryById_thenReturnVoid() {

        //give
        int categoryId = 1;

        //when
        doNothing().when(categoryRepository).deleteById(categoryId);

        //then
        assertAll(() -> categoryService.deleteCategory(categoryId));
    }

    @DisplayName("Get All Category")
    @Test
    public void givenEmployees_whenGetCategories_thenReturnCategories() {

        //give
        Category category1 = Category.builder().id(1).name("category 1").build();
        Category category2 = Category.builder().id(2).name("category 2").build();

        given(categoryRepository.findAll()).willReturn(List.of(category1,category2));

        //when
       List<Category> categories = categoryService.getCategories();

        //then
        assertThat(categories).isNotNull();
        assertThat(categories.size()).isEqualTo(2);
    }

    @DisplayName("Get Category by id")
    @Test
    public void givenCategoryId_whenGetCategory_thenReturnCategory(){
        // given

        Category category = Category.builder().id(1).name("category 1").build();
        given(categoryRepository.findById(1)).willReturn(Optional.of(category));

        // when
        Category savedCategory = categoryService.getCategory(category.getId());

        // then
        assertThat(savedCategory).isNotNull();

    }
    @DisplayName("Update Category")
    @Test
    public void givenCategoryIdAndCategoryDto_whenUpdateCategory_thenReturnCategory(){
        // given
        int categoryId = 1;
        CategoryDto categoryDto = CategoryDto.builder().name("category 1").build();
        Category category = Category.builder().id(1).name("category 2").build();
        given(categoryRepository.getReferenceById(1)).willReturn(category);
        given(categoryRepository.save(category)).willReturn(category);

        // when
        Category updateCategory = categoryService.updateCategory(categoryId,categoryDto);

        // then
        assertThat(updateCategory).isNotNull();
        assertThat(updateCategory.getName()).isEqualTo(categoryDto.getName());

    }
}
