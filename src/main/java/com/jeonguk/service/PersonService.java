package com.jeonguk.service;

import java.util.List;

import com.jeonguk.entity.Person;

public interface PersonService {
    void add(Person person);
    List<Person> listPersons();
}