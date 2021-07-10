package com.sparta.week01.homework.info.controller;

import com.sparta.week01.homework.info.per.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping ("/myinfo")
    public Person getPerson(){
        Person person = new Person();
        person.setName("오상훈");
        person.setAge(25);
        person.setJob("대학생");

        return person;
    }
}
