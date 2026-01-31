package edu.neu.csye6200;

public class CatAbstract extends AbstractAnimalAPI {
    public CatAbstract(String name, int age) { super(name, age); }
    @Override
    public String speak() { return "Meow"; }
}
