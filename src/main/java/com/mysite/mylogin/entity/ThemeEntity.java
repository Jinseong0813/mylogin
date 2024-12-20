package com.mysite.mylogin.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ThemeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int themeid;
    
    //테마가격
    @Column(nullable = false)
    private int theme_price;

    //테마 이미지 경로 
    @Column(nullable = false)
    private String theme_image;
}
