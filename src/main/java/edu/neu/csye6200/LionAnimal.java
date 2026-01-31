package edu.neu.csye6200;

public class LionAnimal extends AnimalAPI {
    public LionAnimal(String name, int age) { super(name, age); }
    @Override public String speak() { return "Roar"; }
}
