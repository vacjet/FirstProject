package Study;

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "Белый";
        c1.engine = "V6";
        c1.speed = 60;

        c1.showInfo();
        c1.gaz(20);
        c1.showInfo();
        c1.tormoz(80);
        c1.showInfo();
    }
}

class Car {
    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println("Цвет: " + color + " Мотор: " + engine + " Скорость: " + speed);
    }
}