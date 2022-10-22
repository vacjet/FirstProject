package Study;

public class Squares {
    public static void main(String[] args) {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (x * 4*x < y * 2*y) System.out.print("# ");
                else System.out.print(". ");
            }
            System.out.println();
        }
    }
}

