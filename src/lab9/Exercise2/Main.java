package lab9.Exercise2;

public class Main {
    public static void main(String[] args) {
        Expr expr = new Multiplication(new Addition(new Constants(2),new Constants(3)),new Constants(4));
        System.out.println(eval(expr));
    }

    public static int eval(Expr expr) {
        return switch (expr) {
            case Constants c -> c.value();
            case Addition a -> eval(a.operand1()) + eval(a.operand2());
            case Multiplication m -> eval(m.operand1()) * eval(m.operand2());
        };
    }
}
