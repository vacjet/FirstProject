package Study;

public class Caar {
    String color;
    String engine;
    int doors;

    Caar(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}

class CaarTest {
    static int qtyDoors(int doors) {
        return doors * 3;
    }

    void changeParams(Caar c1, Caar c2) {
        System.out.println(c1.color + " | " + c2.color);
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CaarTest ct = new CaarTest();
        Caar c1 = new Caar("White", "V6", 5);
        Caar c2 = new Caar("Black", "V4", 4);
        int d1 = qtyDoors(c1.doors);
        int d2 = qtyDoors(c2.doors);
        ct.changeParams(c1, c2); // здесь происходит замена параметров
        System.out.println(c1.color + " | " + c2.color);
        System.out.println("Новое количество дверей: " + d1 + " | " + d2);
    }
}
