public class main {
    public static void main(String[] args) {
        walking();
        swimming();
    }

    /**
     *check if walking.
     */
    public static void walking() {
        Pig p = new Pig();
        p.walk();
        Duck d = new Duck();
        d.walk();
        Fish f = new Fish();
        f.walk();
    }

    /**
     * check if swimming.
     */
    public static void swimming() {
        Pig p = new Pig();
        p.swim();
        Duck d = new Duck();
        d.swim();
        Fish f = new Fish();
        f.swim();
    }

}
