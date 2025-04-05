package src.lab5.exercise1;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
