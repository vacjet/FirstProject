package Study;

public class StudentTest {

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        Student sredn = new Student();

        stu1.numTicket = 12;
        stu1.lastName = "Petrova";
        stu1.name = "Nelli";
        stu1.year = 2021;
        stu1.avgMath = 5;
        stu1.avgEco = 5;
        stu1.avgEng = 5;
//        stu1.avg = (stu1.avgMath + stu1.avgEco + stu1.avgEng) / 3;
        double SrednyayaOtsenka = sredn.avg(stu1.avgMath, stu1.avgEng, stu1.avgEco);

        stu2.numTicket = 31;
        stu2.lastName = "Kashina";
        stu2.name = "Anastasia";
        stu2.year = 2014;
        stu2.avgMath = 5;
        stu2.avgEco = 4;
        stu2.avgEng = 5;
//        stu2.avg = (stu2.avgMath + stu2.avgEco + stu2.avgEng) / 3;
        double SrednyayaOtsenka2 = sredn.avg(stu2.avgMath, stu2.avgEng, stu2.avgEco);

        stu3.numTicket = 201;
        stu3.lastName = "Mohov";
        stu3.name = "Sergey";
        stu3.year = 2020;
        stu3.avgMath = 5;
        stu3.avgEco = 3;
        stu3.avgEng = 3;
//        stu3.avg = (stu3.avgMath + stu3.avgEco + stu3.avgEng) / 3;
        double SrednyayaOtsenka3 = sredn.avg(stu3.avgMath, stu3.avgEng, stu3.avgEco);

        System.out.println(stu1.numTicket + " | " + stu1.lastName + " " + stu1.name + " | " + stu1.year + " | Math: " + stu1.avgMath + " | Economica: " + stu1.avgEco + " | English: " + stu1.avgEng + " | Средняя оценка: " + SrednyayaOtsenka);
        System.out.println(stu2.numTicket + " | " + stu2.lastName + " " + stu2.name + " | " + stu2.year + " | Math: " + stu2.avgMath + " | Economica: " + stu2.avgEco + " | English: " + stu2.avgEng + " | Средняя оценка: " + SrednyayaOtsenka2);
        System.out.println(stu3.numTicket + " | " + stu3.lastName + " " + stu3.name + " | " + stu3.year + " | Math: " + stu3.avgMath + " | Economica: " + stu3.avgEco + " | English: " + stu3.avgEng + " | Средняя оценка: " + SrednyayaOtsenka3);

    }

}

class Student {
    int numTicket;
    String name;
    String lastName;
    int year;
    double avgMath;
    double avgEco;
    double avgEng;

    double avg(double a, double b, double c) {
        double result = (a + b + c) / 3;
//        System.out.println();
        return result;
    }

}