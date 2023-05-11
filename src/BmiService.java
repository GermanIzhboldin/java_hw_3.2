public class BmiService {
    public int calculate(int m, float h) {
        float result;
        result = m / (h * h);

        return (int) result;

    }
}
