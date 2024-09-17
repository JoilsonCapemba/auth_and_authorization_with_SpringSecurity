package com.especialization.auth_and_authorization_with_SpringSecurity.controllers;

import com.especialization.auth_and_authorization_with_SpringSecurity.domains.product.Product;
import com.especialization.auth_and_authorization_with_SpringSecurity.domains.product.ProductRequestDTO;
import com.especialization.auth_and_authorization_with_SpringSecurity.domains.product.ProductResponseDTO;
import com.especialization.auth_and_authorization_with_SpringSecurity.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/create")
    public ResponseEntity createProduct(@RequestBody @Valid ProductRequestDTO body){
        Product newProduct = new Product(body);
        this.productRepository.save(newProduct);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    public ResponseEntity getAllProducts(){
        List<ProductResponseDTO> productList = this.productRepository.findAll().stream().map(ProductResponseDTO::new).toList();
        return ResponseEntity.ok(productList);
    }
}
