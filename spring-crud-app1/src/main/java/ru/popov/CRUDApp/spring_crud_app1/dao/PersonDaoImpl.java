package ru.popov.CRUDApp.spring_crud_app1.dao;

import org.springframework.stereotype.Repository;
import ru.popov.CRUDApp.spring_crud_app1.models.Person;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertPerson(Person person)   {
        entityManager.persist(person);
    }

    @Override
    public void updatePerson(Person person) {
        entityManager.merge(entityManager.contains(person) ? person : entityManager.merge(person));
    }

    @Override
    public void deletePerson(Person person) {
        entityManager.remove(entityManager.contains(person) ? person : entityManager.merge(person));
    }


    @Override
    public Person getPersonById(int id) {
        return entityManager.find(Person.class, id);
    }

    @Override
    public List<Person> getAllPersons() {
        return entityManager.createQuery("SELECT u FROM Person u", Person.class).getResultList();
    }
}
