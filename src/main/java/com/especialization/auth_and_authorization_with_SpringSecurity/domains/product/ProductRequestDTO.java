package com.especialization.auth_and_authorization_with_SpringSecurity.domains.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRequestDTO(@NotBlank String name, @NotNull Integer price) {
}
