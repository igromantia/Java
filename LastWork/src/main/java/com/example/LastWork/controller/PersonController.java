package com.example.LastWork.controller;

import com.example.LastWork.dto.PersonCreateDto;
import com.example.LastWork.persistence.entity.Person;
import com.example.LastWork.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/persons/")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping
    public Person createdPersonDto(@RequestBody PersonCreateDto dto){
        return personService.createPerson(dto);
    }

    @DeleteMapping("/delete/{id}")
    public Person deleteById(@PathVariable("id") Long id){
        return personService.deletePerson(id);
    }
}
