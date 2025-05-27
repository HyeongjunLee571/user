package org.example.jointhemembership.controller;

import org.example.jointhemembership.repository.Userrepository;

public class LowLevelstudentController {

    private final Userrepository repository;

    public LowLevelstudentController(Userrepository repository) {
        this.repository = repository;
    }

    /**
     * 학생 생성 API
     */

    public  String createStudentAPI(){
        return "success";
    }

    /**
     * 학생 목록 조회 API
     */
    public String getStudentListAPI(){
        return "success";
    }

    public String getStudentAPI(){
        return "success";
    }


}
