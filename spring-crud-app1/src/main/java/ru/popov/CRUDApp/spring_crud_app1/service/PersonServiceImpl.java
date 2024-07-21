//package ru.popov.CRUDApp.service;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import ru.popov.CRUDApp.dao.PersonDao;
//import ru.popov.CRUDApp.models.Person;
//
//import java.util.List;
//
//@Service
//public class PersonServiceImpl implements PersonService {
//
//    private final PersonDao personDao;
//
//    @Autowired
//    public PersonServiceImpl(PersonDao personDao) {
//        this.personDao = personDao;
//    }
//
//    @Transactional
//    @Override
//    public void insertPerson(Person person){
//        personDao.insertPerson(person);
//    }
//
//    @Transactional
//    @Override
//    public void updatePerson(Person updatePerson){
//        personDao.updatePerson(updatePerson);
//
//    }
//
//    @Transactional
//    @Override
//    public void deletePerson(Person person){
//        personDao.deletePerson(person);
//    }
//
//    @Transactional(readOnly = true)
//    @Override
//    public Person getPersonById(int id){
//        return personDao.getPersonById(id);
//    }
//
//    @Transactional(readOnly = true)
//    @Override
//    public List<Person> getAllPersons(){
//        return personDao.getAllPersons();
//    }
//
//
//
//}
package ru.popov.CRUDApp.spring_crud_app1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.popov.CRUDApp.spring_crud_app1.dao.PersonDao;
import ru.popov.CRUDApp.spring_crud_app1.models.Person;


import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Transactional
    @Override
    public void insertPerson(Person person){
        personDao.insertPerson(person);
    }

    @Transactional
    @Override
    public void updatePerson(Person updatePerson){
        personDao.updatePerson(updatePerson);

    }

    @Transactional
    @Override
    public void deletePerson(Person person){
        personDao.deletePerson(person);
    }

    @Transactional(readOnly = true)
    @Override
    public Person getPersonById(int id){
        return personDao.getPersonById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Person> getAllPersons(){
        return personDao.getAllPersons();
    }



}