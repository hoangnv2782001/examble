package com.example.demo.service;

import com.example.demo.dto.CategoryDto;
import com.example.demo.dto.ProductDto;
import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    private final CategoryService categoryService;
    @Override
    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Product addProduct(ProductDto productDto) {

        Product product = Product.builder().price(productDto.getPrice()).name(productDto.getName()).category(Category.builder().id(productDto.getCategoryId()).build()).build();
        Product productSaves = productRepository.save(product);

        // gọi update category với propagration = required_new
        CategoryDto categoryDto = CategoryDto.builder().build();

        categoryService.updateCategory(1,categoryDto);

        return productSaves;
    }
}
