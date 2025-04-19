package lab9.Exercise2.diamond;

public interface B extends A {
    default void method(){
        System.out.println("B");
    }
    default void method2(){
        System.out.println("B2");
    }
}
