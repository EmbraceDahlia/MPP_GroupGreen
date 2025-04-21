package lab11Part2.exercise12;

public class Main {
    public static void main(String[] args) {
        MySingletonLazy lazy1=MySingletonLazy.getInstance();
        MySingletonLazy lazy2=MySingletonLazy.getInstance();
        MySingletonLazy lazy3=MySingletonLazy.getInstance();
        if(lazy1==lazy2 && lazy2==lazy3) System.out.println("Real Singleton");
    }
}
