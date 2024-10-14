package com.example.seminar3exemple2REST.Domain;

public class User {
    private String name;

    private int age;

    private String email;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
