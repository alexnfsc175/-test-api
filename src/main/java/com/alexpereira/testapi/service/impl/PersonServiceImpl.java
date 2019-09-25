package com.alexpereira.testapi.service.impl;

import com.alexpereira.testapi.data.PersonRepository;
import com.alexpereira.testapi.model.PersonEntity;
import com.alexpereira.testapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @Override
    public PersonEntity insert(PersonEntity personEntity) {
        return null;
    }

    @Override
    public Page<PersonEntity> findAll(Pageable pageable) {
        return null;
    }
}
