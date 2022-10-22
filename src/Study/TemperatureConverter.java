package Study;

public class TemperatureConverter {
    public void convertTemp(int temperature, char convertTo) {
        if (convertTo == 'F') {
            temperature = (temperature * 9 / 5) + 32;
            System.out.println("Температура в Фаренгейтах: " + temperature + convertTo);
        } else if (convertTo == 'C') {
            System.out.println("Температура в Цельсиях: " + temperature + convertTo);
        } else {
            System.out.println("Введен неверный символ температуры");
        }
    }

    public static void main(String[] args) {
        TemperatureConverter result = new TemperatureConverter();
        result.convertTemp(10, 'F');
    }
}
