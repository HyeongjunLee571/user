package org.example.jointhemembership.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CommentRequestDto {

    String commentContents;
    Long userId;
    Long ScheduleId;

}
