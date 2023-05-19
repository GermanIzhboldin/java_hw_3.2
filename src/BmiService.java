public class BmiService {
    public int calculate(int massKg, float heightM) {
        float result;
        result = massKg / (heightM * heightM);

        return (int) result;

    }
}
