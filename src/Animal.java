abstract class Animal {
    String name;
    public Animal(String name) {

        this.name = name;
    }
     public String getName() {

        return name;
     }

     public abstract boolean swim();
     public abstract boolean walk();
}

class Pig extends Animal {

    public Pig(String name) {
        super(name);
    }
    @Override
    public boolean walk(){

        return true;
    }
    @Override
    public boolean swim() {

        return false;
    }
}

class Duck extends Animal {

    public Duck (String name) {
        super(name);
    }
    @Override
    public boolean walk(){

        return true;
    }
    @Override
    public boolean swim() {

        return true;
    }
}

class Fish extends Animal {

    public Fish (String name) {
        super(name);
    }
    @Override
    public boolean walk(){

        return false;
    }
    @Override
    public boolean swim() {

        return true;
    }
}

