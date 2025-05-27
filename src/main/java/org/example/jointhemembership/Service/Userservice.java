package org.example.jointhemembership.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.jointhemembership.DTO.UserResponseDto;
import org.example.jointhemembership.DTO.UsercheckResponseDto;
import org.example.jointhemembership.Entity.Schedule;
import org.example.jointhemembership.Entity.User;
import org.example.jointhemembership.repository.Userrepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Userservice {

    private final Userrepository userrepository;

    public UserResponseDto userUP(String Username,String password,String email ) {

        User user = new User(Username,email,password);

        User users = userrepository.save(user);

        return new UserResponseDto(users.getId(),users.getUsername(),users.getEmail());
    }

    public UsercheckResponseDto findbyId(Long id) {

        Optional<User> optionaluser = userrepository.findById(id);

        User user = optionaluser.get();

        return new UsercheckResponseDto(user.getUsername(),user.getEmail());
    }

    @Transactional
    public void updtePassword(Long id,String oldPassword,String newPassword) {

        User findUser = userrepository.findByIdOrElseThrow(id);

        if(!findUser.getPassword().equals(oldPassword)){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"비밀번호가 일치 하지 않습니다.");
        }

        findUser.updatePassword(newPassword);
    }

    public void UserlongRequestDto(Long id,String email,String password) {

        User findUser = userrepository.findByIdOrElseThrow(id);

        if(!findUser.getEmail().equals(email)){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"이메일이 일치 하지 않습니다.");
        }

        if(!findUser.getPassword().equals(password)){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"비밀번호가 일치 하지 않습니다.");
        }
    }

    public void UserDelete(Long id) {

        User FindUser = userrepository.findByIdOrElseThrow(id);

        userrepository.delete(FindUser);

    }
}
