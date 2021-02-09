package com.java.spring.springboot.controller;

import com.java.spring.springboot.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/")
public class PeopleController {

    @Autowired
    private PeopleRepository peopleRepository;

}
