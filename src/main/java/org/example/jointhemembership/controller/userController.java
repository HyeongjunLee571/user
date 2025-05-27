package org.example.jointhemembership.controller;

import lombok.RequiredArgsConstructor;
import org.example.jointhemembership.DTO.UpdatePasswordRequestDto;
import org.example.jointhemembership.DTO.UserRequestDto;
import org.example.jointhemembership.DTO.UserResponseDto;
import org.example.jointhemembership.DTO.UsercheckResponseDto;
import org.example.jointhemembership.Service.Userservice;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class userController {

    private final Userservice userService;

    @PostMapping
    public ResponseEntity<UserResponseDto> user(@RequestBody UserRequestDto userRequestDto){

        UserResponseDto userResponseDto = userService.userUP(userRequestDto.getUsername(),
                userRequestDto.getPassword(), userRequestDto.getEmail());

        return new ResponseEntity<>(userResponseDto,HttpStatus.CREATED);

    }

    @GetMapping("/{id}")
    public ResponseEntity<UsercheckResponseDto> findById(@PathVariable Long id){
        UsercheckResponseDto UsercheckResponseDto = userService.findbyId(id);

        return new ResponseEntity<>(UsercheckResponseDto,HttpStatus.OK);
    }


    @PatchMapping("/{id}")
    public ResponseEntity<Void> upatePassword(
         @PathVariable Long id,
         @RequestBody UpdatePasswordRequestDto requesDto
    ){
        userService.updtePassword(id,requesDto.getOldPassword(),requesDto.getNewPassword());

        return new ResponseEntity<>(HttpStatus.OK);
    }


}
