package com.example.studyproject.controller;


import com.example.studyproject.dto.Test;
import com.example.studyproject.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/query")
    public List<Test> query() throws Exception{
        return testService.getAll();
    }

}
