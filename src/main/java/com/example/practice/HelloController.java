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
        return ResponseEntity.ok("Hello world! " + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalTime.now()));
    }

}
