package org.example.jointhemembership.repository;

import org.example.jointhemembership.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.lang.reflect.Member;
import java.util.Optional;

public interface Userrepository extends JpaRepository<User,Long> {

    Optional<User> findMemberByUsername(String username);

    default User findByIdOrElseThrow(Long id) {
        return findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Does not exist id = " + id));
    }

    default User findMemberByUsernameOrElseThrow(String username) {
        return findMemberByUsername(username).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Does not exist username = " + username));
    }
}
