package src.lab3.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
    private String name;
    private List<Building> buildings;

    public Landlord(String name) {
        this.name = name;
        this.buildings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Landlord ");
        sb.append("Name = '").append(name).append("'").append("\nBuildings\n").append(buildings);
        return sb.toString();
    }

    public void addBuilding(Building b) {
        this.buildings.add(b);
    }

    public double calculateProfit() {
        double profit = 0;
        for (Building b : buildings) {
            profit += b.calculateBuildingIncome();
        }
        return profit;
    }

}
