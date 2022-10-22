package Study;

class Car3 {
    public void start() {
        System.out.println("I'm starting");
    }

    public void stop() {
        System.out.println("I'm stopped");
    }

    public int drive(int howlong) {
        return howlong * 60;
    }
}

public class CarOwner {

    public static void main(String[] args) {
        JamesBondCar strt = new JamesBondCar();
        strt.start();
        System.out.println(strt.drive(3));
        strt.stop();
    }

}
