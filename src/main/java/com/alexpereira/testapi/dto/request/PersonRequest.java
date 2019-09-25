package com.alexpereira.testapi.dto.request;

import com.alexpereira.testapi.model.PersonEntity;

public class PersonRequest {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonEntity toEntity(){
        PersonEntity person = new PersonEntity();
        person.setName(this.name);
        return person;
    }
}
