package B5;

public class Main {
    public static void main(String[] args) {
        Animal tom = new Animal("Toms", 3, 20.0f);
        Animal jerry = new Animal("Tom", 3, 20.0f);
        //print result of equals method
        System.out.println(tom.equals(jerry));
        System.out.println(tom);
        System.out.println(jerry);

        Animal ogy = new Cat("ogy", 3, 25.5f, "yellow");
        System.out.printf(ogy.toString());
        //down casting
        Cat cat = (Cat) ogy;
        System.out.println(cat);
    }
}
