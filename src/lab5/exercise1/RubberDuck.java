package lab5.exercise1;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new CannotFly(),new Squeak());
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
