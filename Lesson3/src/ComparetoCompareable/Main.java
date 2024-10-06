package ComparetoCompareable;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Le Hong Son", "12A3", 9);
        Student s2 = new Student(2, "Nguyen Thi An", "12A3", 9);
        Student s3 = new Student(3, "Lieu ", "12A3", 9);

        System.out.println(s1.getLastName());
        System.out.println(s2.getLastName());
        System.out.println(s3.getLastName());

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
    }
}
