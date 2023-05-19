public class BmiService {
    public int calculate(int mass, float height) {
        float result;
        result = mass / (height * height);

        return (int) result;

    }
}
