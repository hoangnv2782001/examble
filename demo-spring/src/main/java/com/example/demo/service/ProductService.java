package com.example.demo.service;

import com.example.demo.dto.ProductDto;
import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProduct();

    Product addProduct(ProductDto productDto);
}
