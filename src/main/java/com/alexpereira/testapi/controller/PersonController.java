package com.alexpereira.testapi.controller;

import com.alexpereira.testapi.dto.request.PersonRequest;
import com.alexpereira.testapi.dto.response.PersonResponse;
import com.alexpereira.testapi.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PersonRequest> pulseGas(@RequestBody PersonRequest personRequest){
        this.personService.insert(personRequest.toEntity());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/")
    public ResponseEntity<List<PersonResponse>> getLastPulses(@PageableDefault(value = 10, sort = {"id"}, direction = Sort.Direction.DESC) Pageable pageable){
        return ResponseEntity.ok(this.personService
                .findAll(pageable)
                .stream()
                .map(PersonResponse::fromEntity)
                .collect(Collectors.toList())
        );
    }
}
