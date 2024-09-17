package com.especialization.auth_and_authorization_with_SpringSecurity.domains.product;

import java.util.UUID;

public record ProductResponseDTO(String id, String name, Integer price) {
    public ProductResponseDTO(Product product){
        this(product.getId(), product.getName(), product.getPrice());
    }
}
