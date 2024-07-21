package ru.popov.CRUDApp.spring_crud_app1.service;



import ru.popov.CRUDApp.spring_crud_app1.models.Person;

import java.util.List;

public interface PersonService {
    void insertPerson(Person person);
    void updatePerson(Person updatedPerson);
    void deletePerson(Person person);
    Person getPersonById(int id);
    List<Person> getAllPersons();
}