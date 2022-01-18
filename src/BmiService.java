public class BmiService {
    double height;
    double weight;
    double square = 2;
    double BodyMassIndex;


    public double calculate (double height, double weight) {
        height = Math.pow(height, square);
        BodyMassIndex = weight / height;

        return BodyMassIndex;
    }
}
