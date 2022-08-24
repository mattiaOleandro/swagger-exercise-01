package co.develhope.swaggerexercise01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping(value = "/user")
    public String getName(@RequestParam String name){

        return "The name of user is " + name;
    }
}
