package com.alexpereira.testapi.data;

import com.alexpereira.testapi.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
