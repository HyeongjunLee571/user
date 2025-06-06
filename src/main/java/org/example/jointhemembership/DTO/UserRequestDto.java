package org.example.jointhemembership.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class UserRequestDto {

    private String username;
    private String email;
    private String password;

    public UserRequestDto(String username,String email,String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

}
