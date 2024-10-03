package LearnAbstractClass;

public class Circle extends Shape {
    private double radius;
    //this is constructor
    public Circle(Coordinates coordinates, double radius) {
        super(coordinates);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
