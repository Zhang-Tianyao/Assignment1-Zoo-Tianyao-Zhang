package edu.neu.csye6200;

public class DogAbstract extends AbstractAnimalAPI {
    public DogAbstract(String name, int age) { super(name, age); }
    @Override
    public String speak() { return "Woof"; }
}
