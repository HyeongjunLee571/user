package org.example.jointhemembership.DTO;


import lombok.Getter;

@Getter
public class UsercheckResponseDto {

    private String username;
    private String email;


    public UsercheckResponseDto(String username,String email) {
        this.username = username;
        this.email = email;
    }
}
