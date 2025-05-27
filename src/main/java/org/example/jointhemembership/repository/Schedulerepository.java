package org.example.jointhemembership.repository;

import org.example.jointhemembership.Entity.Schedule;
import org.example.jointhemembership.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public interface Schedulerepository extends JpaRepository<Schedule,Long> {

    default Schedule findByIdOrElseThrow(Long id) {
        return findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Does not exist id = " + id));
    }
}
