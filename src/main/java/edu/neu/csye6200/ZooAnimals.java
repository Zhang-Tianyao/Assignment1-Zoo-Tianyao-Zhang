package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAnimals {
    private List<AnimalAPI> animals = new ArrayList<>();

    public void add(AnimalAPI a) { animals.add(a); }

    public void show() { animals.forEach(a -> System.out.println(a)); }

    public static void demo() {
        ZooAnimals zoo = new ZooAnimals();
        zoo.add(new DogAnimal("Buddy", 3));
        zoo.add(new CatAnimal("Mimi", 2));
        zoo.add(new LionAnimal("Simba", 5));
        zoo.show();
    }
}
