package edu.neu.csye6200;

public class LionAnimalistic implements AnimalisticAPI {
    private String name;
    private int age;

    public LionAnimalistic(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String speak() { return "Roar"; }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() { return toInfoString(); }
}
