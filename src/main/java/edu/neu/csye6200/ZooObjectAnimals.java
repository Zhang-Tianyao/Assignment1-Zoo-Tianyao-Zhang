package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooObjectAnimals {
    private List<Object> animals = new ArrayList<>();

    public void add(Object o) { animals.add(o); }

    public void show() { animals.forEach(o -> System.out.println(o)); }

    public static void demo() {
        ZooObjectAnimals zoo = new ZooObjectAnimals();

        // Concrete
        zoo.add(new DogAnimal("Buddy", 3));
        zoo.add(new CatAnimal("Mimi", 2));
        zoo.add(new LionAnimal("Simba", 5));

        // Abstract
        zoo.add(new DogAbstract("Buddy", 3));
        zoo.add(new CatAbstract("Mimi", 2));
        zoo.add(new LionAbstract("Simba", 5));

        // Interface
        zoo.add(new DogAnimalistic("Buddy", 3));
        zoo.add(new CatAnimalistic("Mimi", 2));
        zoo.add(new LionAnimalistic("Simba", 5));

        zoo.show();
    }
}
