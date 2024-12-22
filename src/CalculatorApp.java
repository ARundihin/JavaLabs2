public class CalculatorApp {
    private double sum = 0.0;
    private Formula formula;

    public CalculatorApp() {
        formula = new Formula();
    }

    public double calculateFormula1(double x, double y, double z) {
        return formula.calculateFormula1(x, y, z);
    }

    public double calculateFormula2(double x, double y, double z) {
        return formula.calculateFormula2(x, y, z);
    }

    public void addToSum(double value) {
        sum += value;
    }

    public void clearSum() {
        sum = 0.0;
    }

    public double getSum() {
        return sum;
    }
}
