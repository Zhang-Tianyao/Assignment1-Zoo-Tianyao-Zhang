package edu.neu.csye6200;

public class DogAnimalistic implements AnimalisticAPI {
    private String name;
    private int age;

    public DogAnimalistic(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String speak() { return "Woof"; }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() { return toInfoString(); }
}
