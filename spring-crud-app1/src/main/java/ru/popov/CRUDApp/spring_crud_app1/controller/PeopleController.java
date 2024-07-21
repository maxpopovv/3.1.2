package ru.popov.CRUDApp.spring_crud_app1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.popov.CRUDApp.spring_crud_app1.models.Person;
import ru.popov.CRUDApp.spring_crud_app1.service.PersonService;


import java.util.List;

@Controller
public class PeopleController {

    private final PersonService personService;

    @Autowired
    public PeopleController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/users")
    public String showPerson(Model model) {
        List<Person> userList = personService.getAllPersons();
        model.addAttribute("persons", personService.getAllPersons());
        return "users";
    }

    @PostMapping("/addPerson")
    public String addPerson(@RequestParam("name") String name, @RequestParam("email") String email) {
        Person person = new Person(name, email);
        personService.insertPerson(person);
        return "redirect:/users";
    }

    @PostMapping("/deletePerson")
    public String deletePerson(@RequestParam("id") int id) {
        Person person = personService.getPersonById(id);
        if (person != null) {
            personService.deletePerson(person);
        }
        return "redirect:/users";
    }


    @GetMapping("/editPerson")
    public String showEditForm(@RequestParam("id") int id, Model model) {
        Person person = personService.getPersonById(id);
        model.addAttribute("person", person);
        return "editPerson";
}


    @PostMapping("/editPerson")
    public String updatePerson(@ModelAttribute Person person) {
        personService.updatePerson(person);
        return "redirect:/users";
    }



}