package com.example.demo;



public class Actor {

    private String name;
    private int id;


    public Actor() {
    }

    public Actor(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}