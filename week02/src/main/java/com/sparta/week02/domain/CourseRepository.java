package com.sparta.week02.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

// 생성, 삭제, 조회할때 필요