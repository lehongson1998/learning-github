package LearnAbstractClass;

public abstract class Shape {
    private Coordinates coordinates;

    public Shape(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public abstract double getArea();
}
