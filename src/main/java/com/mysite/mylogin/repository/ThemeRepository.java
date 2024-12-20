package com.mysite.mylogin.repository;

import com.mysite.mylogin.entity.ThemeEntity;
import com.mysite.mylogin.entity.UserEntity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ThemeRepository extends JpaRepository<ThemeEntity, Integer> {
}
