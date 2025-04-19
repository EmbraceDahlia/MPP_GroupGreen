package lab9.Exercise2.diamond;

public class DClass implements B,C {
    @Override
    public void method() {
        B.super.method();
    }

    @Override
    public void method2() {
        C.super.method2();
    }

    public static void main(String[] args) {
        DClass dc=new DClass();
        dc.method();
        dc.method2();
    }
}
