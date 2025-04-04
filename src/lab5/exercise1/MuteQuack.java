package lab5.exercise1;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("cannot quack");
    }
}
