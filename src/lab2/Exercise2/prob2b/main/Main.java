package lab2.Exercise2.prob2b.main;

import lab2.Exercise2.prob2b.Order;

public class Main {
    public static void main(String[] args) {
        Order o1=new Order(1,"Pencil");
        o1.addOrderLine("Eraser");
        System.out.println(o1);
        Order o2=new Order(2,"RTX");
        System.out.println(o2);
    }
}
