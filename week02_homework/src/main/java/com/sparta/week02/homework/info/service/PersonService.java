package com.sparta.week02.homework.info.service;


import com.sparta.week02.homework.info.domain.Person;
import com.sparta.week02.homework.info.domain.PersonRepository;
import com.sparta.week02.homework.info.domain.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service

public class PersonService {
    private final PersonRepository personRepository;

/*    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
*/

    @Transactional
    public Long update (Long id, PersonRequestDto requestDto){
        Person person1 = personRepository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("해당 id 존재하지 않음")
        );
        person1.update(requestDto);
        return person1.getId();
    }

}
