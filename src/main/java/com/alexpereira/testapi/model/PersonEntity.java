package com.alexpereira.testapi.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "PersonEntity")
@Table(name = "PersonEntity")
@SequenceGenerator(allocationSize = 1, initialValue = 1, name = "person_seq", sequenceName = "person_seq")
public class PersonEntity {

    private  Long id;
    private  String name;
    private LocalDateTime timeStamp;



    @Id
    @GeneratedValue(generator = "person_seq", strategy = GenerationType.SEQUENCE)
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


    @CreationTimestamp
    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
