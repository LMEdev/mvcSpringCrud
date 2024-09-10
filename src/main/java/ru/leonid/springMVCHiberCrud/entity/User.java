package ru.leonid.springMVCHiberCrud.entity;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "benchPressWeight", nullable = false)
    private Integer benchPressWeight;

    public User() {
    }

    public User(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public User(String name, String surname, Integer age, Integer benchPressWeight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.benchPressWeight = benchPressWeight;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getBenchPressWeight() {
        return benchPressWeight;
    }

    public void setBenchPressWeight(Integer benchPressWeight) {
        this.benchPressWeight = benchPressWeight;
    }
}
