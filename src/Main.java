public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 2; //Работает в метрах
        double weight = 80; // Работает в килограммах
        double index = service.calculate(height, weight);
        System.out.println(index);
    }
}