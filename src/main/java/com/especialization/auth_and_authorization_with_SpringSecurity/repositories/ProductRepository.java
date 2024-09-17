package com.especialization.auth_and_authorization_with_SpringSecurity.repositories;

import com.especialization.auth_and_authorization_with_SpringSecurity.domains.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, String> {
}
