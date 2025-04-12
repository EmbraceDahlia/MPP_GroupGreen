package lab5.exercise1;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super(new FlyWithWings(),new Quack());
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
