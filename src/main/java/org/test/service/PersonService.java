package org.test.service;

import org.test.model.entity.Person;
import org.test.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

//    @PersistenceContext
//    private EntityManager entityManager;

    public Person find(int id) { return personRepository.findById(id); }

    public List<Person> findAll() { return personRepository.findAll(); }

    public List<Person> findLastname(String lastname) {  return personRepository.findByLastname(lastname);  }

    public Person AddPerson(Person person) { return personRepository.save(person); }

    public Person updatePerson(Person person) {
        Person personne = find(person.getId());
        personne.setFirstname(person.getFirstname());
        personne.setLastname(person.getLastname());
        return personRepository.save(personne);
    }
    public void deletePerson(int id){ Person person = find(id); personRepository.delete(person);}


//    public Claim create(Claim claim) {
//        final Claim createdClaim = claimRepository.saveAndFlush(claim);
//        entityManager.refresh(createdClaim);
//        return createdClaim;
//    }
}
