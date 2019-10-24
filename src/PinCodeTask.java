public class PinCodeTask {

    public static void main(String[] args) {

        System.out.println(validatePin("12"));
        System.out.println(validatePin("12"));
        System.out.println(validatePin("123"));
        System.out.println(validatePin("12345"));
        System.out.println(validatePin("1234567"));
        System.out.println(validatePin("-1234"));
        System.out.println(validatePin("1.234"));
        System.out.println(validatePin("-44444"));
        System.out.println(validatePin("44DF44"));
        System.out.println(validatePin("'4'+44"));
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("0221"));
        System.out.println(validatePin("00"));
        System.out.println(validatePin("+111"));
        System.out.println(validatePin(" "));

    }

    private static boolean validatePin(String pin) {
        char[] pinArray = pin.toCharArray();
        for (char c : pinArray) {
            if (c == '+' ) {
                return false;
            } else {
                try {
                    int number = Integer.parseInt(pin);
                    return ((pinArray.length == 4 || pinArray.length == 6) && number >= 0);
                } catch (NumberFormatException e) {
                    return false;
                }
            }
        }

        return false;
    }
}


//ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
//If the function is passed a valid PIN string, return true, else return false.


