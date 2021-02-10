package com.java.spring.springboot.controller;

import com.java.spring.springboot.model.People;
import com.java.spring.springboot.repository.PeopleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class PeopleController {

    @Autowired
    private PeopleRepository peopleRepository;

    @GetMapping("/peoples")
    public List<People> getAllPeople(){
        return peopleRepository.findAll();
    }

}
