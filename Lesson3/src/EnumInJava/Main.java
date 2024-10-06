package EnumInJava;

public class Main {
    public static void main(String[] args) {
        DateTime january = DateTime.JANUARY;
        System.out.println("total day of january " + january.getDay());

        for(DateTime dateTime: DateTime.values()) {
            System.out.println(dateTime + " (" + dateTime.getDay() + ")");
        }
    }
}
