package org.test.repository;

import org.test.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long>, JpaSpecificationExecutor<Person>, CrudRepository<Person, Long> {
    Person findById(int id);

    List<Person> findByLastname(String lastname);

}
