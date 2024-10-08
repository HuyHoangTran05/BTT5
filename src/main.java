public class main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.addAnimal(new Pig("pig"));
        farm.addAnimal(new Duck("duck"));
        farm.addAnimal(new Fish("fish"));
        farm.canSwim();
        farm.canWalk();
    }
}
