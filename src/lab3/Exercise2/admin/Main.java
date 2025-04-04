package src.lab3.Exercise2.admin;

import src.lab3.Exercise2.Building;
import src.lab3.Exercise2.Landlord;

public class Main {
    public static void main(String[] args) {
        Building b1=new Building(1,100,400);
        b1.addApartment(500);
        b1.addApartment(600);

        Building b2=new Building(2,200,1000);
        b2.addApartment(900);
        b2.addApartment(800);
        b2.addApartment(500);

        Landlord l=new Landlord("Rujuan");
        l.addBuilding(b1);
        l.addBuilding(b2);
        System.out.println(l);
        System.out.printf("The landlord make a profit of %,.2f.",l.calculateProfit());
    }
}
