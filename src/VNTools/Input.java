package VNTools;
import javax.swing.JOptionPane;

public class Input {

    /** Shows input dialog for int value.
     * @param pytanie accepts a String with a message for input dialog */
    public static int swingInt(String pytanie) {
        String str = JOptionPane.showInputDialog("Integer: " + pytanie);
        return Integer.parseInt(str);
    }

    /** Shows input dialog for int value.
     * @param pytanie accepts a String with a message for input dialog */
    public static long swingLong(String pytanie) {
        String str = JOptionPane.showInputDialog("Long: " + pytanie);
        return Long.parseLong(str);
    }

    /** Shows input dialog for String value.
     * @param pytanie accepts a String with a message for input dialog */
    public static String swingString(String pytanie) {
        String str = JOptionPane.showInputDialog("String: " + pytanie);
        return str;

    }

}

// TODO: 29/11/2016. Whaa about char?