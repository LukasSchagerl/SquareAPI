package com.example.squareapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareController {

    // show status message http://localhost:8080/api/square
    @GetMapping("/api/square")
    public double suare(double a){

        return a*a;
    }


}
