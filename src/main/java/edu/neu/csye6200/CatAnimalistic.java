package edu.neu.csye6200;

public class CatAnimalistic implements AnimalisticAPI {
    private String name;
    private int age;

    public CatAnimalistic(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String speak() { return "Meow"; }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() { return toInfoString(); }
}
