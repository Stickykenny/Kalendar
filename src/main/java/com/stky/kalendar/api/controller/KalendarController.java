package com.stky.kalendar.api.controller;

import com.stky.kalendar.api.model.KalendarEvent;
import com.stky.kalendar.api.model.Person;
import com.stky.kalendar.api.repo.PersonRepo;
import com.stky.kalendar.api.service.KalendarService;
import com.stky.kalendar.api.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class KalendarController {


    @Autowired
    PersonRepo personRepo;

    private final KalendarService kalendarService;


    /*@PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person) {
        personRepo.save(person);
    }

    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable Long id){
        return personService.getPersonById(id);
    } // */

    @Autowired
    public KalendarController(KalendarService kalendarService) {
        this.kalendarService = kalendarService;
    }



    @GetMapping("/welcome")
    public String getWelcome(){
        return "Welcome to the Kalendar";
    }

    @GetMapping
    public String getEvent(@RequestParam Integer id){
        return kalendarService.getEvent(id).toString();
    }

    @GetMapping("/Kalendar")
    public String getCalendars(){
        return "Welcome to the Kalendar";
    } // */
}
