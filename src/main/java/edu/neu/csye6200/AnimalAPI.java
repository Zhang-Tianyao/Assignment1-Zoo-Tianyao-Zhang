package edu.neu.csye6200;

public class AnimalAPI {
    private String name;
    private int age;
    public AnimalAPI(String name, int age)
    { this.name = name; this.age = age; }
    public String speak()
    { return "Some generic sound"; }
    @Override
    public String toString()
    { return getClass().getSimpleName() + " [name=" + name + ", age=" + age + ", sound=" + speak() + "]"; }
}