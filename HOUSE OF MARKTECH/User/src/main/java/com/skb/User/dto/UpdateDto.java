package com.skb.User.dto;

import lombok.Data;

@Data
public class UpdateDto {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phoneNumber;
}
