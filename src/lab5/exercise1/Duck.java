package lab5.exercise1;

public abstract class Duck {
// The Duck class uses the FlyBehavior and QuackBehavior interfaces through composition

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    Duck(FlyBehavior fb,QuackBehavior qb){
        this.flyBehavior=fb;
        this.quackBehavior=qb;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("swimming");
    }

    public abstract void display();
}
