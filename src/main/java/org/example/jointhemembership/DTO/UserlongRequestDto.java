package org.example.jointhemembership.DTO;

import lombok.Getter;

@Getter
public class UserlongRequestDto {

    private String email;
    private String password;

    public UserlongRequestDto(String email,String password) {
        this.email = email;
        this.password = password;

    }

}
