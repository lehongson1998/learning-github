package B4;

public class Main {
    public static void main(String[] args) {
        // added new comments
        Animal son = new Person("Mai jackson", 50, "187592899", 170.0f, 60.0f);
        System.out.println(son);
        son.name = son.name.toUpperCase();
        System.out.println(son);
    }
}
