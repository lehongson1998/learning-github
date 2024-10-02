package LearnAbstractClass;

public class Main {
    public static void main(String[] args) {
        Coordinates c1 = new Coordinates(1,2);
        Coordinates c2 = new Coordinates(3,4);

        Shape cirle = new Circle(c1, 5);
        Shape rectangle = new Rectangle(c2, 15, 20);

        System.out.println("coordinates of Cirle = " + cirle.getCoordinates().toString());
        System.out.println("Area Of Cirle = " + cirle.getArea());
        System.out.println("coordinates of Rectangle = " + rectangle.getCoordinates().toString());
        System.out.println("Area Of Rectangle = " + rectangle.getArea());
    }
}
