import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Animal> animalList;

    /**
     * constructor.
     */
    public Farm() {
        animalList = new ArrayList<>();
    }

    /**
     * add new animal.
     * @param animal new animal
     */
    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    /**
     * print animal can swim.
     */
    public void canSwim() {
        for (Animal animal : animalList) {
            if (animal.swim()) {
                System.out.println(animal.getName());
            }
        }
        System.out.println("/////////////////////////////////////");
    }

    /**
     * print animal can walk.
     */
    public void canWalk() {
        for (Animal animal : animalList) {
            if (animal.walk()) {
                System.out.println(animal.getName());
            }
        }
        System.out.println("/////////////////////////////////////");
    }

}
