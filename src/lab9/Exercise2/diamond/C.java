package lab9.Exercise2.diamond;

public interface C extends A {
    default void method(){
        System.out.println("C");
    }
    default void method2(){
        System.out.println("C2");
    }
}
