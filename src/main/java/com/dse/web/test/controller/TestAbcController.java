package com.dse.web.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestAbcController {

    @RequestMapping("/abc")
    public Object abc() {
        return "123";
    }
}
