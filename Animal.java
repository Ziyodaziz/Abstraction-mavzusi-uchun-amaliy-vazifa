package AbstractTask;

public abstract class Animal {

    public abstract void sound();


    public abstract void getName();


    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal duck = new Duck();

        dog.getName();
        dog.sound();
        cat.getName();
        cat.sound();
        duck.getName();
        duck.sound();
    }

}
