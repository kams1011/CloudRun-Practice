package com.example.practice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {


    @GetMapping("/")
    public ResponseEntity sayHello(){
        String contents = "Hello, World!" + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalTime.now());
        return ResponseEntity.ok(contents);
    }

}
