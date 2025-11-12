package interfaceintro;

import java.util.List;

public class AnimalUtility {

    public static void makeNoise(List<Animal> animals){
        for (int i = 0; i < animals.size(); i++){
            animals.get(i).speak();
        }
    }
}
