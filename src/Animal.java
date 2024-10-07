interface Animal {
    void swim();
    void walk();
}

class Pig implements Animal {
    @Override
    public void walk() {
        System.out.println("Pig");
    }
    @Override
    public void swim() {

    }
}

class Duck implements Animal {
    public void swim() {
        System.out.println("Duck");
    }
    public void walk() {
        System.out.println("Duck");
    }
}

class Fish implements Animal {
    @Override
    public void swim() {
        System.out.println("Fish");
    }

    @Override
    public void walk() {

    }
}

