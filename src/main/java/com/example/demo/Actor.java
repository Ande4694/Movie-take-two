package com.example.demo;

import java.io.Serializable;

public class Actor implements Serializable {

    private String name;
    private int age;
    private boolean female;

    public Actor() {
    }

    public Actor(String name, int age, boolean female) {
        this.name = name;
        this.age = age;
        this.female = female;
    }

    public String getName() {
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

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", female=" + female +
                '}';
    }
}
