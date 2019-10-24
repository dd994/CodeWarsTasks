

public class SumOfSeries {

    public static void main(String[] args) {

        System.out.println(seriesSum(18));

    }

    public static String seriesSum(int n) {

        double[] numbers = new double[n];
        numbers[0] = 1;
        String result;
        double j = 4;
        double sum = 1;

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = 1/j;
            j += 3;
            sum = sum + numbers[i];
        }
        double sum2 = Math.round(sum*100);

//        result = Double.toString(sum2/100);

        return String.format("%.2f",sum2/100);
    }
}
