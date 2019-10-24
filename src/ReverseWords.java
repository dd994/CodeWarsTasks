public class ReverseWords {

    public static void main(String[] args) {
        String str1 = "a";
        System.out.println(reverseWords(str1));
    }

    private static String reverseWords(final String original) {

        String[] strArray = original.split(" ");
        String result = "";
        char[] charArray = original.toCharArray();

        if (charArray.length > 1) {
            for (int i = 0; i < charArray.length - 1; i++) {
                for (int j = i + 1; j < charArray.length; j++) {
                    if (charArray[i] == charArray[j]) {
                        return original;
                    } else {
                        for (int k = 0; k < strArray.length; k++) {
                            result += " " + new StringBuilder().append(strArray[k]).reverse().toString();
                        }
                        return result.trim();
                    }
                }
            }
        } else {
            return original;
        }
        return original;
    }
}

//Complete the function that accepts a string parameter, and reverses each word in the string.
// All spaces in the string should be retained.



