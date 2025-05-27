package org.example.jointhemembership.DTO;

import com.mysql.cj.callback.UsernameCallback;
import lombok.Getter;
import org.example.jointhemembership.Entity.Schedule;
import org.example.jointhemembership.Entity.User;

@Getter
public class ScheduleResponseDto {

    private final Long id;
    private final String username;
    private final String title;
    private final String contents;


    public ScheduleResponseDto(Long id,String username,String title, String contents) {
        this.id = id;
        this.username = username;
        this.title = title;
        this.contents = contents;
    }

    public static ScheduleResponseDto ScheduleResponseDto(Schedule schedule){

        User user = new User();

        return new ScheduleResponseDto(schedule.getId(),user.getUsername(),schedule.getTitle(),schedule.getContents());
    }
}
