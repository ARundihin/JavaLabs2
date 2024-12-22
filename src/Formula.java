public class Formula {

    public double calculateFormula1(double x, double y, double z) {
        double sqrtComponent = (Math.sin(Math.PI * y * y) + Math.log(y * y)) / ( Math.sin(Math.PI * z * z) + Math.sin(x) + Math.log(z * z) + x * x + Math.pow(Math.PI, Math.cos(2 * x)));
        double lnComponent = Math.pow(Math.pow(x, 2) + Math.sin(z) + Math.pow(Math.E, Math.cos(z)), 1/4);
        return sqrtComponent * lnComponent;
    }

    public double calculateFormula2(double x, double y, double z)
    {
        return y * Math.pow(x, 2) / (Math.log(Math.pow(z, y)) + Math.pow(Math.cos(Math.pow(x, 1/3)), 2));
    }
}