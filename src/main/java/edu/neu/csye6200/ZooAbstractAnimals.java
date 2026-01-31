package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAbstractAnimals {
    private List<AbstractAnimalAPI> animals = new ArrayList<>();

    public void add(AbstractAnimalAPI a) { animals.add(a); }

    public void show() { animals.forEach(a -> System.out.println(a)); }

    public static void demo() {
        ZooAbstractAnimals zoo = new ZooAbstractAnimals();
        zoo.add(new DogAbstract("Buddy", 3));
        zoo.add(new CatAbstract("Mimi", 2));
        zoo.add(new LionAbstract("Simba", 5));
        zoo.show();
    }
}
