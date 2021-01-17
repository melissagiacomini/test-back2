package org.test.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String lastname;

    private String firstname;

    public Person(int id, String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname= lastname;
        this.id = id;
    }
    public Person(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = 0;
    }
    public Person(){
        this.firstname = null;
        this.lastname = null;
        this.id = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
