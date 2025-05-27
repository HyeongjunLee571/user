package org.example.jointhemembership.repository;

import org.example.jointhemembership.Entity.Schedule;
import org.example.jointhemembership.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Schedulerepository extends JpaRepository<Schedule,Long> {
}
