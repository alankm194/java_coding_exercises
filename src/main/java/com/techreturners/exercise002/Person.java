package com.techreturners.exercise002;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String location;
    public Person(String firstName, String lastName,  String location, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

}
