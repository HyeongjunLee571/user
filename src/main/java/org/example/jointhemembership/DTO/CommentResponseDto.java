package org.example.jointhemembership.DTO;

import lombok.Getter;

@Getter
public class CommentResponseDto {

    String commentContents;
    Long userId;
    Long ScheduleId;
}
