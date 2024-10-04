package LearnInterface;

public class CasioFX500 implements ICalculator{
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double mult(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        if (b != 0) return a / b;
        return 0;
    }
}
