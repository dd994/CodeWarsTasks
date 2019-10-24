public class TheFeastOfManyBeasts {

    public static void main(String[] args) {

    }

    public static boolean feast(String beast, String dish) {

        char[] beastChars = beast.toCharArray();
        char[] dishChars = dish.toCharArray();

        if ((beastChars[0] == dishChars[0]) && ((beastChars[beastChars.length - 1] == dishChars[dishChars.length - 1]))) {
            return true;
        } else
            return false;
    }

}



