package com.alexpereira.testapi.dto.response;

import com.alexpereira.testapi.model.PersonEntity;

import java.time.LocalDateTime;

public class PersonResponse {

    public  PersonResponse(){}

    private Long id;
    private String name;
    private String timeStamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp.toString();
    }

    public static PersonResponse fromEntity(PersonEntity personEntity){
        PersonResponse personResponse = new PersonResponse();
        personResponse.setId(personEntity.getId());
        personResponse.setName(personEntity.getName());
        personResponse.setTimeStamp(personEntity.getTimeStamp());
        return personResponse;
    }

}
