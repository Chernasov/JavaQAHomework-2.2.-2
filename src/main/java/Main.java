public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKilograms = 79;
        int heightInCentimeters = 173;
        double bodyMassIndex = service.calculate(weightInKilograms,heightInCentimeters);
        System.out.printf("Ваш индекс массы тела составляет %.2f\n", bodyMassIndex);
    }
}
