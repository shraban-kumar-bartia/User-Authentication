package com.skb.User.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterDto {

    @NotEmpty
    private String firstname;

    @NotEmpty
    private String lastname;

    private String username;

    @NotEmpty
    private String email;

    @NotEmpty
    private String password;

    private String phoneNumber;
    
}
