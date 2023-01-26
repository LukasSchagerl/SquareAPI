package com.example.squareapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareApiController {



    @GetMapping("/api/square")
        public double square(double a){
        return a*a;
    }

}
