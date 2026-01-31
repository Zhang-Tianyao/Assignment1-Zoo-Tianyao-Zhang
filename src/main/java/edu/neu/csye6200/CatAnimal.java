package edu.neu.csye6200;

public class CatAnimal extends AnimalAPI {
    public CatAnimal(String name, int age) { super(name, age); }
    @Override public String speak() { return "Meow"; }
}
