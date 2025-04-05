package lab3.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private int buildingNo;
    private double maintenanceCost;
    private List<Apartment> apartments = new ArrayList<>();

    public Building(int buildingNo, double maintenanceCost, double apartmentRentalFee) {
        this.buildingNo = buildingNo;
        this.maintenanceCost = maintenanceCost;
        this.apartments.add(new Apartment(apartmentRentalFee));
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    @Override
    public String toString() {
        return "\nBuilding{" +
                "Building No. = " + buildingNo +
                ", Maintenance Cost = " + maintenanceCost +
                ", Apartments = " + apartments +
                "}\n";
    }

    public void addApartment(double rentalFee) {
        this.apartments.add(new Apartment(rentalFee));
    }

    public double calculateBuildingIncome() {
        double buildingIncome = 0;
        for (Apartment a : apartments) {
            buildingIncome += a.getRentalFee();
        }
        buildingIncome -= maintenanceCost;
        return buildingIncome;
    }
}
