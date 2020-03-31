package com.binance.future.listener;

import com.binance.future.entity.Person;
import com.binance.future.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.util.List;

public class AppLoading implements ApplicationListener<ApplicationEvent> {

    @Autowired
    private PersonService personService;

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        List<Person> personList = personService.getAllPersons();
        for(Person person: personList) {
            System.out.println(person.getName());
        }
    }

}
