import static java.lang.Integer.parseInt;

public class OddorEven {

    public static void main(String[] args) {
        int[] array = {1, 30, 1,55,89};


        System.out.println(oddOrEven(array));
    }

    public static String oddOrEven(int[] array) {

        String result ;
        int numberSum = 0 ;

        for (int num : array) {
            numberSum = numberSum + num;

        }

        if (numberSum % 2 != 0) {
            result = "odd";
        } else {
            result = "even";
        }

        return result;
    }

}
