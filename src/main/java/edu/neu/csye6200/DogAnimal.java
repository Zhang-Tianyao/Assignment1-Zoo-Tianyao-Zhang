package edu.neu.csye6200;

public class DogAnimal extends AnimalAPI {
    public DogAnimal(String name, int age) { super(name, age); }
    @Override public String speak() { return "Woof"; }
}
