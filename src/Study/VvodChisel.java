package Study;
//Программа считывает с клавиатуры числа до тех пор, пока вводят именно числа.
import java.util.Scanner;

public class VvodChisel {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (console.hasNextInt()) {
            int x = console.nextInt();
        }
    }
}