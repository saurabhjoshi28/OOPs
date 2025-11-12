package interfaceintro;

import java.util.ArrayList;
import java.util.List;

public class AnimalTester {
    public static void main(String[] args){
//        Animal animal;
//        animal = new Cat();
//        animal.move();
//        animal = new Dog();
//        animal.speak();

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        AnimalUtility.makeNoise(animals);
    }
}
