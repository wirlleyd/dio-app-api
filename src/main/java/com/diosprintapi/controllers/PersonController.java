/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diosprintapi.controllers;

import com.diosprintapi.dtos.CreatePersonDto;
import com.diosprintapi.entities.Person;
import com.diosprintapi.services.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    
    @Autowired
    PersonService personService;
    
    @GetMapping()
    public List<Person> findAll() {
        return personService.findAll();
    }
    
    @PostMapping()
    public Person create(@RequestBody CreatePersonDto createPerson) {
        return personService.create(createPerson);
    }
}
