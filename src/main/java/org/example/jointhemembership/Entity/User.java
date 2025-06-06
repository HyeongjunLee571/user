package org.example.jointhemembership.Entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false,unique = true)
    private  String email;

    @Column(nullable = false)
    private String password;

    public User(){}

    public User(String username,String email,String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void updatePassword(String password){
        this.password = password;
    }

}
