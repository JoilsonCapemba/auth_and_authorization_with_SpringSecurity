package com.especialization.auth_and_authorization_with_SpringSecurity.domains.product;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "product")
@Entity(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price;

    public Product(ProductRequestDTO data){
        this.name = data.name();
        this.price = data.price();
    }

}
