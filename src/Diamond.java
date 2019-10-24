import java.util.ArrayList;

public class Diamond {

    public static void main(String[] args) {

        System.out.println(printDiamond(5));

    }

    public static String printDiamond(int n) {

        StringBuilder shape = new StringBuilder();
        StringBuilder north = new StringBuilder();
        StringBuilder center = new StringBuilder();
        StringBuilder south = new StringBuilder();
        ArrayList<String> shapeArray = new ArrayList<>();



        for (int i = 1; i < (n + 1) / 2; i++) {
            for (int j = 1; j <= n; j++) {
                if (j > (n + 1) / 2 - i && (j < (n + 1) / 2 + i)) {
                    north.append("*");
                } else {
                    north.append(" ");
                }
            }
            north.append('\n');
            shapeArray.add(shape.toString());

        }

        for (int i = 0; i < n; i++) {
            center.append("*");
            if (i == n - 1) {
                center.append('\n');
            }
            shapeArray.add(shape.toString());
        }

        for (int i = 1; i < (n + 1) / 2; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i && j > i) {
                    south.append("*");
                } else {
                    south.append(" ");
                }
            }
            south.append('\n');
            shapeArray.add(shape.toString());


        }

//        String southStr = south.toString().replaceAll("\\s+$", "")+'\n';

        shape.append(north).append(center).append(south);
        String end = "^$";
//        String[] shapeArray = shape.toString().split(end);

//        for (int i = 0; i < shapeArray.length(); i++) {
////            System.out.println(i);
////        }

        if (!(n % 2 == 0) && n > 0) {
            return shapeArray.toString();
        } else
            return null;

    }
}
