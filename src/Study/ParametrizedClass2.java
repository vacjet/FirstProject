package Study;

public class ParametrizedClass2 {
    public static void main(String[] args) {
    Pairz<String> pair1 = new Pairz<>("privet", "poka");
        System.out.println(pair1.getValue1() + " \n" + pair1.getValue2());
    }

}

class Pairz<V> {
    private V value1;
    private V value2;

    public Pairz(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}