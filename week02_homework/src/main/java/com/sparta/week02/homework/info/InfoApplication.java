package com.sparta.week02.homework.info;

import com.sparta.week02.homework.info.domain.Person;
import com.sparta.week02.homework.info.domain.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class InfoApplication {
    public static void main(String[] args) {
        SpringApplication.run(InfoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PersonRepository personRepository) {
        return (args) -> {
            personRepository.save(new Person("오상훈", 25, "대학생"));
        };
    }
}
