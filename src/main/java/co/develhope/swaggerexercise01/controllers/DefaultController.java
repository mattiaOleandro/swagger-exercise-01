package co.develhope.swaggerexercise01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/default")
public class DefaultController {

    @GetMapping
    public String getDefault(){

        return "Welcome on exercise Swagger 01";
    }
}
