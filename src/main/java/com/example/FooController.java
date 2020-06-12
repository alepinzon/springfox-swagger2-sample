package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping(path="/foo")
public class FooController {

    @GetMapping(path = "/{id}", produces = "application/json")
    public FooResource getResource(@PathVariable Integer id){
        return FooResource.builder()
                .uuid(UUID.randomUUID().toString())
                .date(new Date())
                .id(id)
                .build();
    }

}
