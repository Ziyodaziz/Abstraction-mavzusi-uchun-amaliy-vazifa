package AbstractTask;

public class Duck extends Animal{

    @Override
    public void sound() {
        System.out.println("Duck sound -> quack quack");
    }

    @Override
    public void getName() {
        System.out.println("Duck name -> Duck");
    }
}
