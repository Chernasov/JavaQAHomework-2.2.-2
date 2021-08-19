public class BmiService {
    public double calculate(double massa, int height) {
        double bmi = massa * 10000 / (height * height);
        return bmi;
    }
}
