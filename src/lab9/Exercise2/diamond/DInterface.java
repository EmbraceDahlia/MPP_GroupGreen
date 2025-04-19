package lab9.Exercise2.diamond;

public interface DInterface extends B,C{
    @Override
    default void method() {
        B.super.method();
    }

    @Override
    default void method2() {
        C.super.method2();
    }
}
