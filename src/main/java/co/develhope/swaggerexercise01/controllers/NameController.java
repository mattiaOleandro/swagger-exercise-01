package co.develhope.swaggerexercise01.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping(value = "/user")
    @ApiOperation(value = "Name user", notes = "Print out the message for the User")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 202, message = "Created"),
            @ApiResponse(code = 400, message = "Bad input data"),
            @ApiResponse(code = 500, message = "Internal error from spring", response = String.class)
    })
    public String getName(@RequestParam String name){

        return "The name of user is " + name;
    }
}
