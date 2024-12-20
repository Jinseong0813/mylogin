package com.mysite.mylogin.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CalendarEntity {
    @Id
    @Column(name = "calendar_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calendarId;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @Column(nullable = false)
    private LocalTime startTime;

    @Column(nullable = false)
    private LocalTime endTime;

    @Column(nullable = false, length = 20)
    private String title;

    @Column(length = 255)
    private String comment;

    @Column(nullable = false, length = 1, name = "alram_status")
    private String alramStatus = "N";

    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    private UserEntity userid;
}
