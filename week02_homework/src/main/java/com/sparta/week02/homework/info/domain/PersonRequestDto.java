package com.sparta.week02.homework.info.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor

public class PersonRequestDto {
    private final String name;
    private final int age;
    private final String job;
}
