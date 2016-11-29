package Universe.codeWars;

import VNTools.ArrayShow;
import VNTools.Input;

public class p0004_IntToReversedArray {

    public static void main(String[] args) {
        String str = String.valueOf(Input.swingInt("Number to reverse: "));
        System.out.println(str);
                int strLength = str.length();
                int[] array = new int[strLength];
                for (int i = 0; i < strLength; i++){
        array[i] = (int)(str.charAt(strLength - i - 1)) - 48;
        }
        ArrayShow.oneDimIntPrintValues(array, "", "");
        }

}
// TODO: make it return reversed number.
/**
 * Nikitakun(6 kyu)2 months ago
    Could anyone clarify why we subtract 48 here?

 boyarkogc(7 kyu)2 months ago1 edit
    Casting a char to int returns its ascii value. The ascii value for '0' for example is 48,
    so subtracting 48 from it will convert it into its proper int value.
  */
