package B5;

public class Main {
    public static void main(String[] args) {
        Animal tom = new Animal("Toms", 3, 20.0f);
        Animal jerry = new Animal("Tom", 3, 20.0f);

        System.out.println(tom.equals(jerry));
    }
}
