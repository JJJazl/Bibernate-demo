package com.bibernate.demo.app.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.svydovets.annotation.Entity;
import org.svydovets.annotation.Id;
import org.svydovets.annotation.JoinColumn;
import org.svydovets.annotation.OneToOne;
import org.svydovets.annotation.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "persons")
public class Address {

    @Id
    private Integer id;

    private String city;

    private String street;

    private String number;

    private String apartment;

    private Integer zip;

    @OneToOne
    @JoinColumn(name="person_id")
    private Person person;
}
