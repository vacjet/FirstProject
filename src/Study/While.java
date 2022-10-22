package Study;

public class While {
    public static void main(String[] args) {
        int value = 1;
        while (value < 5) { /* В круглых скобках указано условие, при котором цикл остановится*/
            System.out.println("Это цикл While " + value);
            value = value + 1;
        }
    }
}
