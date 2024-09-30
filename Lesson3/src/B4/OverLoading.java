package B4;

public class OverLoading {
    public static int add(int a, int b){
        return a+b;
    }

    public static float add(float a, float b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        float x = 5.9f, y = 10.0f;
        System.out.println("a + b = " + add(a,b));
        System.out.println("a + b + c = " + add(a, b, c));
        System.out.println("x + y = " + add(x, y));
    }
}
