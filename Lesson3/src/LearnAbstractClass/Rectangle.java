package LearnAbstractClass;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Coordinates coordinates, double width, double height) {
        super(coordinates);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    public double minusArea() {
        return this.getArea() / 2;
    }
}
