package AbstractTask;

public class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("Dog sound -> boow boow");
    }

    @Override
    public void getName() {
        System.out.println("Dog name -> Hatiko");
    }
}
