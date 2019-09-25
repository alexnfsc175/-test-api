package com.alexpereira.testapi.service;

import com.alexpereira.testapi.model.PersonEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonService {

    PersonEntity insert(PersonEntity personEntity);
    Page<PersonEntity> findAll(Pageable pageable);

}