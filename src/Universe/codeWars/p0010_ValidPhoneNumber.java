package Universe.codeWars;

public class p0010_ValidPhoneNumber {

    public static boolean validPhoneNumber(String phoneNumber) {
        boolean isValid = false;
        if (phoneNumber.charAt(0) == '(')
            if (phoneNumber.charAt(1) >= 48 && phoneNumber.charAt(1) <= 57)
                if (phoneNumber.charAt(2) >= 48 && phoneNumber.charAt(2) <= 57)
                    if (phoneNumber.charAt(3) >= 48 && phoneNumber.charAt(3) <= 57)
                        if (phoneNumber.charAt(4) == ')')
                            if (phoneNumber.charAt(5) == ' ')
                                if (phoneNumber.charAt(6) >= 48 && phoneNumber.charAt(6) <= 57)
                                    if (phoneNumber.charAt(7) >= 48 && phoneNumber.charAt(7) <= 57)
                                        if (phoneNumber.charAt(8) >= 48 && phoneNumber.charAt(8) <= 57)
                                            if (phoneNumber.charAt(9) == '-')
                                                if (phoneNumber.charAt(10) >= 48 && phoneNumber.charAt(10) <= 57)
                                                    if (phoneNumber.charAt(11) >= 48 && phoneNumber.charAt(11) <= 57)
                                                        if (phoneNumber.charAt(12) >= 48 && phoneNumber.charAt(12) <= 57)
                                                            if (phoneNumber.charAt(13) >= 48 && phoneNumber.charAt(13) <= 57)
                                                                if (phoneNumber.length() == 14)
                                                                    isValid = true;
        return isValid;
    }

//import java.util.regex.Pattern;
//    public class Kata {
//        public static boolean validPhoneNumber(String phoneNumber) {
//            return Pattern.matches("^\\(\\d{3}\\) \\d{3}-\\d{4}$", phoneNumber);
//        }

}

// KYU 6. validPhoneNumber("(123) 456-7890")  =>  returns true.


