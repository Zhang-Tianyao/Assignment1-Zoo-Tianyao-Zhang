package edu.neu.csye6200;

public class LionAbstract extends AbstractAnimalAPI {
    public LionAbstract(String name, int age) { super(name, age); }
    @Override
    public String speak() { return "Roar"; }
}
