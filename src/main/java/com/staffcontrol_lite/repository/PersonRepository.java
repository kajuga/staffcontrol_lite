package com.staffcontrol_lite.repository;


import com.staffcontrol_lite.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Person}  class.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

}
