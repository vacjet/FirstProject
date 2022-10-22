package Study;

public class MonthSwitch {

    public static final int SEPTEMBER = 9;

    public static void month(int a) {

        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Количество дней: 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Количесто дней: 30");
                break;
            case 2:
                System.out.println("Количество дней: 28");
                break;
            default:
                System.out.println("Введен неверный номер месяца!");

        }
    }

    public static void main(String[] args) {
        month(-2);
        month(1);
        month(2);
        month(11);
        month(13);
    }
}
