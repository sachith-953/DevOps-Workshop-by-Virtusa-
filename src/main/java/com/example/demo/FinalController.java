package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FinalController {

    @RequestMapping("/final")
    public String finalEndpointsString() {
        return "This is Final Submission DevOps Workshop By Virtusa";
    }

}
