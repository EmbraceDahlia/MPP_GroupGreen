package lab9.Exercise2;

public sealed interface Expr permits Constants, Addition, Multiplication {
}

record Constants(int value) implements Expr {
}

record Addition(Expr operand1, Expr operand2) implements Expr{
}

record Multiplication(Expr operand1, Expr operand2) implements Expr{
}

