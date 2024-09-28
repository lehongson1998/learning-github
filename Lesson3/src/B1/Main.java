package B1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 3, 2.5f, "Black", "Blue");

        cat1.speak("Lồn");
        cat1.sleep();
        cat1.eat("cứt");

        Cat cat2 = new Cat("Jerry", 5, 3.2f, "Black", "Brown");

        cat2.speak("Cặc");
        cat2.sleep();
        cat2.eat("cứt");
    }
}