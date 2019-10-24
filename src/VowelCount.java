public class VowelCount {
    public static void main(String[] args) {

        String string = "ggosuleties";
        System.out.println(getCount(string));

    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if(c == 'a'|| c == 'e'||c == 'i'||c == 'o'||c == 'u'){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}

// a, e, i, o, and u