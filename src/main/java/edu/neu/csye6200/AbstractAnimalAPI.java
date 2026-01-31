package edu.neu.csye6200;

public abstract class AbstractAnimalAPI {
    private String name;
    private int age;

    public AbstractAnimalAPI(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String speak();

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [name=" + name + ", age=" + age + ", sound=" + speak() + "]";
    }
}
