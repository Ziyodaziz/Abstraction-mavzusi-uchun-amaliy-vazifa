package AbstractTask;

public class Cat extends Animal{

    @Override
    public void sound() {
        System.out.println("Cat sound -> Meuv meav");
    }

    @Override
    public void getName() {
        System.out.println("Cat name -> Tom");
    }
}
