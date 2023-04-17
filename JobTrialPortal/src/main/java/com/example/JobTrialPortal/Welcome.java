package com.example.JobTrialPortal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/welcome")
    public String returnWelcome(){
        return "Hellow World";
    }
}
