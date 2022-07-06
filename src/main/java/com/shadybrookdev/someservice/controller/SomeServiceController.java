package com.shadybrookdev.someservice.controller;

import com.shadybrookdev.someservice.config.SomeConfig;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SomeServiceController {
    final SomeConfig someConfig;

    @GetMapping(path = "/message")
    String retrieveMessage(){
        return someConfig.getMessage();
    }
}
