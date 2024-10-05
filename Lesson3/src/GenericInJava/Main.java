package GenericInJava;

public class Main {
    public static void main(String[] args) {
        Person<Integer> person = new Person<>(1, "Le Hong Son");
        System.out.println(person);
        person.printValue(1000);
        person.printValue("Le Hong Son");

        Person<Double> Person2 = new Person<>(2.0, "Doan Moc Cuc");
        System.out.println(Person2);
    }
}
