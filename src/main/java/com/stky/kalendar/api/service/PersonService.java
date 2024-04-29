package com.stky.kalendar.api.service;

import com.stky.kalendar.api.model.Person;
import com.stky.kalendar.api.model.PersonDto;
import com.stky.kalendar.api.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepo personRepository;

    @Autowired
    public PersonService(PersonRepo personRepo){
        this.personRepository = personRepo;
    }

    public PersonDto getPersonDtoById(Long id){
        Person personEntity = personRepository.getReferenceById(id);

        return PersonDto.builder()
                .name(personEntity.getName())
                .build();
    }
}
