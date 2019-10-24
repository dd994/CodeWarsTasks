public class DoubleArray {
    public static void main(String[] args) {
        int [] array = {2,5,6};

    }

    @Override
    public String toString() {
        return "DoubleArray{}";
    }

    public static int[] doubledArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
                arr[i]= arr[i] * 2;
        }
        return arr;

    }

}
