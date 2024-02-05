package com.bibernate.demo.app.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.svydovets.annotation.Column;
import org.svydovets.annotation.Entity;
import org.svydovets.annotation.Id;
import org.svydovets.annotation.OneToMany;
import org.svydovets.annotation.Table;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "persons")
public class Person {

    @Id
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany
    private List<Note> notes = new ArrayList<>();
}
