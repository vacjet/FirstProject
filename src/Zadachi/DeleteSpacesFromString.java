package Zadachi;

public class DeleteSpacesFromString {
    public static void main(String[] args) {
        System.out.println(removewhitespaces(" sds sds6 11 sdsd 5555 sdsd45 1"));
//        JOptionPane.showMessageDialog(null,"Hello!!!");
    }

    public static String removewhitespaces(String str) {
        return str.replaceAll("\\s", "");
    }
}
