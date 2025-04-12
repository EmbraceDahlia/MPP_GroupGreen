package lab5.exercise1;

public class MallardDuck extends Duck {

    public MallardDuck() {
       super(new FlyWithWings(),new Quack());
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
