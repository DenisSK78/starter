package com.home.starter.conroller;

import com.home.starter.StarterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {

    final StarterService service;

    public StarterController(StarterService service) {
        this.service = service;
    }

    @GetMapping("/starter")
    public String getResponse(){
        return service.getCurrentPass().toString();
    }
}
