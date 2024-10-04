package LamdaExpresion;

public class Main {
    public static void main(String[] args) {
        SumInteger s = (int... arg) -> {
            int sum = 0;
            for (int j : arg) {
                sum += j;
            }
            return sum;
        };

        System.out.println(s.sum(1, 2, 3, 4, 5, 6));

        MinusInteger m = (int a, int b) -> a - b;
        System.out.println(m.minusInteger(15, 20));
        MinusInteger n = (int a, int b) -> (a > b) ? a - b : b - a;

        System.out.println(n.minusInteger(10, 20));
    }
}