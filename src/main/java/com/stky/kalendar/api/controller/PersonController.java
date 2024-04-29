package com.stky.kalendar.api.controller;

import com.stky.kalendar.api.model.Person;
import com.stky.kalendar.api.model.PersonDto;
import com.stky.kalendar.api.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }
    @GetMapping("/welcome")
    public String getWelcome(){
        return "Welcome to the Kalendar";
    }
    /*@GetMapping("/{id}")
    public PersonDto getPerson2(@PathVariable Long id){
        PersonDto personDto = personService.getPersonDtoById(id);
        return (personDto);
    }*/

        @GetMapping("/pp")
    public ResponseEntity<PersonDto> getPerson(){
        //return new Person(342, "dsu");
            PersonDto personDto = personService.getPersonDtoById(2L);
            return ResponseEntity.ok(personDto);
    }
}
