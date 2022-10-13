package lessons6hw;

public class Employee {
    int id;
    String surname;
    float salary = 0.0f;
    String department = "";

    Employee(int id, String surname, float salary, String department) {
        this.id = id;
        this.surname =surname;
        this.salary = salary;
        this.department = department;

        System.out.println(id + surname + salary + department);
    }
    float boostX2() {
        return salary * 2;
    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee p1 = new Employee(1, "Ivanov", 1000, "Cleaning");
        p1.boostX2();
        System.out.println(p1.boostX2());
        Employee p2 = new Employee(2, "Petrov", 1250, "Cleaning2");
        p2.boostX2();
        System.out.println(p2.boostX2());
    }
}

