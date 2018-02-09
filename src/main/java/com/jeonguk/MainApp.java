package com.jeonguk;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jeonguk.config.AppConfig;
import com.jeonguk.entity.Person;
import com.jeonguk.service.PersonService;

public class MainApp {
    
    private static Logger logger = LoggerFactory.getLogger(MainApp.class);
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService personService = context.getBean(PersonService.class);

        // Add Persons
        personService.add(new Person("Sunil", "Bora", "suni.bora@example.com"));
        personService.add(new Person("David", "Miller", "david.miller@example.com"));
        personService.add(new Person("Sameer", "Singh", "sameer.singh@example.com"));
        personService.add(new Person("Paul", "Smith", "paul.smith@example.com"));

        // Get Persons
        List<Person> persons = personService.listPersons();
        for (Person person : persons) {
            logger.info("Id = " + person.getId());
            logger.info("First Name = " + person.getFirstName());
            logger.info("Last Name = " + person.getLastName());
            logger.info("Email = " + person.getEmail());
            logger.info("");
        }

        context.close();
    }

}