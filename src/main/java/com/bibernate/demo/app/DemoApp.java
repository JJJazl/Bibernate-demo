package com.bibernate.demo.app;

import com.bibernate.demo.app.entity.Note;
import com.bibernate.demo.app.entity.Person;
import org.svydovets.session.Session;
import org.svydovets.session.SessionFactory;

public class DemoApp {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new SessionFactory();
        Session session = sessionFactory.createSession();

        System.out.println("Select note by id=2");
        Note note = session.findById(Note.class, 2L);
        System.out.println(note);

        System.out.println("Select person by id=1");
        Person person = session.findById(Person.class, 1L);
        System.out.println(person);

        System.out.println("Select all notes by person id=1");
        person.getNotes().forEach(System.out::println);

        session.close();
    }
}
