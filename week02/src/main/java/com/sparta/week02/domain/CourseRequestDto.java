package com.sparta.week02.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class CourseRequestDto {
    private final String title;
    private final String tutor;
}

// 무언가 변경을 원할때 등 데이터를 옮길 필요성이 있을때 사용