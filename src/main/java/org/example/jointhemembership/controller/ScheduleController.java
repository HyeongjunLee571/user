package org.example.jointhemembership.controller;


import lombok.RequiredArgsConstructor;
import org.checkerframework.common.reflection.qual.GetMethod;
import org.example.jointhemembership.DTO.ScheduleRequestDto;
import org.example.jointhemembership.DTO.ScheduleResponseDto;
import org.example.jointhemembership.Service.Scheduleservic;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

@RestController
@RequestMapping("/Schedule")
@RequiredArgsConstructor
public class ScheduleController {

    private final Scheduleservic scheduleservic;

    @PostMapping
    public ResponseEntity<ScheduleResponseDto> save(
            @RequestBody ScheduleRequestDto requestDto
            ){
        ScheduleResponseDto scheduleResponseDto = scheduleservic.save(requestDto.getUsername(),
                requestDto.getTitle(), requestDto.getContents());

        return new ResponseEntity<>(scheduleResponseDto,HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ScheduleResponseDto>> findAll(){
        List<ScheduleResponseDto> scheduleResponseDtoList = scheduleservic.findAll();

        return new ResponseEntity<>(scheduleResponseDtoList,HttpStatus.OK);
    }

}
