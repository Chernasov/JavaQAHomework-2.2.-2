public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKilograms = 80;
        int heightInCentimeters = 173;
        int bodyMassIndex = service.calculate(weightInKilograms,heightInCentimeters);
        System.out.println("Ваш индекс массы тела составляет " + bodyMassIndex);
    }
}
