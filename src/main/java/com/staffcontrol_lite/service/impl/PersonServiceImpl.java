package com.staffcontrol_lite.service.impl;

import com.staffcontrol_lite.model.Person;
import com.staffcontrol_lite.repository.PersonRepository;
import com.staffcontrol_lite.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public Person getById(Long id) {
        log.info("IN PersonServiceImpl getById {}", id );
        return personRepository.getById(id);
    }

    @Override
    public void save(Person person) {
        log.info("IN PersonServiceRepository save {}", person);
        personRepository.save(person);

    }

    @Override
    public void delete(Long id) {
        log.info("IN PersonServiceREpository deleteById {}", id);
        personRepository.deleteById(id);
    }

    @Override
    public List<Person> getAll() {
        log.info("IN PersonServiceRepository getAll");
        return personRepository.findAll();
    }
}










