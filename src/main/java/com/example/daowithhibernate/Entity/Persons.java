package com.example.daowithhibernate.Entity;

import jakarta.persistence.*;

@Entity
public class Persons {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int age;
    @Column
    private String phoneNumber;
    @Column
    private String cityOfLiving;
}
