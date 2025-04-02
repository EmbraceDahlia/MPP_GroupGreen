package lab3.Exercise3.Inheritance;

class Cylinder extends Circle {
    private double radius;
    public double height;

    public Cylinder() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double computeVolume() {
        return 2 * this.computeArea(radius) + height * 2 * Math.PI * radius;
    }
}