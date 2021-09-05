package com.staffcontrol_lite.service;

import com.staffcontrol_lite.model.Person;

import java.util.List;

public interface PersonService {

    Person getById(Long id);

    void save(Person person);

    void delete(Long id);

    List<Person> getAll();

}
