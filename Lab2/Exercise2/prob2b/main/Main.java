package Lab2.Exercise2.prob2b.main;


import Lab2.Exercise2.prob2b.Order;
import Lab2.Exercise2.prob2b.OrderLine;

public class Main {
    public static void main(String[] args) {
        Order o1=new Order(1,"Pencil");
        o1.addOrderLine("Eraser");
        System.out.println(o1);
        Order o2=new Order(2,"RTX");
        System.out.println(o2);
    }
}
