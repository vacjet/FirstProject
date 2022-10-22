package Study;

public class StudentOverloading {

    StudentOverloading() {
        this(0, null, null, 0, 0, 0, 0);
    }

    StudentOverloading(int numTicket2, String lastName2, String name2) {
        this(numTicket2, lastName2, name2, 0, 0, 0, 0);
    }

    StudentOverloading(int numTicket0, String lastName0, String name0, int year0, int avgMath0, int avgEco0, int avgEng0) {
        numTicket = numTicket0;
        lastName = lastName0;
        name = name0;
        year = year0;
        avgMath = avgMath0;
        avgEco = avgEco0;
        avgEng = avgEng0;
    }

    int numTicket;
    String lastName;
    String name;
    int year;
    int avgMath;
    int avgEco;
    int avgEng;
}

class StudentOverloadingTest {
    public static void main(String[] args) {
        StudentOverloading stu1 = new StudentOverloading(13, "Фролов", "Кантимир", 2011, 4, 5, 4);
        System.out.println(stu1.numTicket + " | " + stu1.lastName + " " + stu1.name + " | " + stu1.year + " | Math: " + stu1.avgMath + " | Economica: " + stu1.avgEco + " | English: " + stu1.avgEng);
        StudentOverloading stu2 = new StudentOverloading(18, "Петрова", "Ольга");
        System.out.println(stu2.numTicket + " | " + stu2.lastName + " " + stu2.name);
        StudentOverloading stu3 = new StudentOverloading();
//        System.out.println(stu3.numTicket + " | " + stu3.lastName + " " + stu3.name + " | " + stu3.year );
    }
}

