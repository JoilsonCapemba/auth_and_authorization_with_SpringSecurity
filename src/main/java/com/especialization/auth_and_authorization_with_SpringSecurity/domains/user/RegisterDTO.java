package com.especialization.auth_and_authorization_with_SpringSecurity.domains.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
