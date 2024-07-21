package ru.popov.CRUDApp.spring_crud_app1.dao;


import ru.popov.CRUDApp.spring_crud_app1.models.Person;

import java.util.List;

public interface PersonDao {
    void insertPerson(Person person);
    void updatePerson(Person person);
    void deletePerson(Person person);
    Person getPersonById(int id);
    List<Person> getAllPersons();
}