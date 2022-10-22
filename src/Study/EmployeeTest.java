package Study;

class Employee {
    int id;
    String surname;
    int age;
    String department;

    int salary(int a) {
        int result = a * 2;
//        System.out.println();
        return result;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee zp = new Employee();
        Employee rab1 = new Employee();

//        int zarplata = zp.salary(40);

        rab1.id = 11;
        rab1.surname = "Козлов";
        rab1.age = 41;
        rab1.department = "Бухгалтерия";

        System.out.println(rab1.id + " | " + rab1.surname + " | Возраст: " + rab1.age + " | " + rab1.department + " | " + rab1.salary(40));

    }
}
