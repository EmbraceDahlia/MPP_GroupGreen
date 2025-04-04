package src.lab3.Exercise3.Composition;

class Cylinder {
    private Circle top;
    public double height;

    public Cylinder(double radius) {
        this.top = new Circle(radius);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double computeVolume() {
        return 2 * this.top.computeArea() + height * 2 * Math.PI * this.top.getRadius();
    }
}