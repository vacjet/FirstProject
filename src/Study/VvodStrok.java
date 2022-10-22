package Study;
//Программа будет вводить строки с клавиатуры, пока не будет введена строка exit.

import java.util.Scanner;

public class VvodStrok {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            String s = console.nextLine();
            isExit = s.equals("exit");
        }
    }
}
