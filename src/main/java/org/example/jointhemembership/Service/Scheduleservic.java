package org.example.jointhemembership.Service;


import lombok.RequiredArgsConstructor;
import org.example.jointhemembership.DTO.ScheduleResponseDto;
import org.example.jointhemembership.DTO.ScheduleinquiryResponseDto;
import org.example.jointhemembership.Entity.Schedule;
import org.example.jointhemembership.Entity.User;
import org.example.jointhemembership.repository.Schedulerepository;
import org.example.jointhemembership.repository.Userrepository;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

@Service
@RequiredArgsConstructor
public class Scheduleservic {

    private final Userrepository userrepository;
    private final Schedulerepository schedulerepository;

    public ScheduleResponseDto save(String username,String title,String contents) {

        User finduser = userrepository.findMemberByUsernameOrElseThrow(username);

        Schedule schedule = new Schedule(title, contents);
        schedule.setUser(finduser);

        Schedule saveSchedule = schedulerepository.save(schedule);


        return new ScheduleResponseDto(saveSchedule.getId(),username,saveSchedule.getTitle(),saveSchedule.getContents());
    }

    public List<ScheduleResponseDto> findAll() {

        return schedulerepository.findAll()
                .stream()
                .map(ScheduleResponseDto::ScheduleResponseDto)
                .toList();
    }

    public ScheduleinquiryResponseDto findById(Long id) {
        Schedule findschedule = schedulerepository.findByIdOrElseThrow(id);
        User writer = findschedule.getUser();

        return new ScheduleinquiryResponseDto(findschedule.getTitle(),findschedule.getContents(), writer.getUsername());
    }

    public void ScheduleDelete(Long id) {
        Schedule findSchedule = schedulerepository.findByIdOrElseThrow(id);

        schedulerepository.delete(findSchedule);
    }
}
