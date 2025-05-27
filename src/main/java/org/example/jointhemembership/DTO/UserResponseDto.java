package org.example.jointhemembership.DTO;

import lombok.Getter;
import org.example.jointhemembership.Entity.BaseEntity;

import java.time.LocalDateTime;

@Getter
public class UserResponseDto {

    private Long id;
    private String username;
    private String email;

    public UserResponseDto(Long id,String username,String email) {
        this.id = id;
        this.username = username;
        this.email = email;

    }

    public UserResponseDto(){

    }

}
