package com.jeonguk.dao;

import java.util.List;

import com.jeonguk.entity.Person;

public interface PersonDao {
    void add(Person person);
    List<Person> listPersons();
}