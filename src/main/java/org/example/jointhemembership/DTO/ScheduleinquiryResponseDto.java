package org.example.jointhemembership.DTO;

import lombok.Getter;

@Getter
public class ScheduleinquiryResponseDto {

    private final String username;
    private final String title;
    private final String contents;

    public ScheduleinquiryResponseDto(String username, String title, String contents) {
        this.username = username;
        this.title = title;
        this.contents = contents;
    }
}
