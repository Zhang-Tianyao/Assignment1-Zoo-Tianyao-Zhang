package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAnamalisticAnimals {
    private List<AnimalisticAPI> animals = new ArrayList<>();

    public void add(AnimalisticAPI a) { animals.add(a); }

    public void show() { animals.forEach(a -> System.out.println(a)); }

    public static void demo() {
        ZooAnamalisticAnimals zoo = new ZooAnamalisticAnimals();
        zoo.add(new DogAnimalistic("Buddy", 3));
        zoo.add(new CatAnimalistic("Mimi", 2));
        zoo.add(new LionAnimalistic("Simba", 5));
        zoo.show();
    }
}
