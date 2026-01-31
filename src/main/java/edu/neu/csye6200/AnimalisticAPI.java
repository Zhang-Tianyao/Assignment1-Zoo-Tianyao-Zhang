package edu.neu.csye6200;

public interface AnimalisticAPI {
    String speak();
    String getName();
    int getAge();

    default String toInfoString() {
        return getClass().getSimpleName() +
                " [name=" + getName() + ", age=" + getAge() + ", sound=" + speak() + "]";
    }
}
