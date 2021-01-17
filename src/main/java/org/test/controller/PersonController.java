package org.test.controller;

import org.test.model.entity.Person;
import org.test.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
@CrossOrigin(origins = "*")
public class PersonController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> findAll() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Person findPerson(@PathVariable int id) {
        return personService.find(id);
    }

    @GetMapping("/lastname/{lastname}")
    public List<Person> findFamily(@PathVariable String lastname) { return personService.findLastname(lastname); }

    @GetMapping("/create")
    public Person AddPersons(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname) {
        Person person = new Person(firstname,lastname);
        //LOGGER.info(person.getFirstname());
        //LOGGER.info(person.getLastname());
        return personService.AddPerson(person);
    }

    @GetMapping("/update")
    public Person updatePerson(@RequestParam ("id") int id, @RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname){
        Person person = new Person(id,firstname,lastname);
        return personService.updatePerson(person);
    }

    @GetMapping("/delete")
    public void deletePerson(@RequestParam ("id") int id) {
        personService.deletePerson(id);
    }
}
