package com.agenda.models;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false, unique = true)
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="email", nullable=false, unique=true)
    private String email;


}
