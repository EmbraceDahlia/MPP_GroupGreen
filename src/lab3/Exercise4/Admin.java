package lab3.Exercise4;

public class Admin {
    public static double computeTotalRent(Property[] properties) {
        double totalRent = 0;
        for (Property p : properties) {
            totalRent += p.computeRent();
        }
        return totalRent;
    }
}
