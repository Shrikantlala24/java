import java.util.*;

class employee {
    private String _name;
    int _salary;

    employee(String name, int salary) {
        this._name = name;
        this._salary = salary;
    }

    void getsalary() {
        System.out.println("Salary of " + this._name + " is: " + this._salary);
    }
}

public class Emplyoyee_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of the employee ");
        String name = sc.nextLine();
        System.out.println("enter the salary of the employee ");
        int salary = sc.nextInt();

        employee s1 = new employee(name, salary);
        s1.getsalary();
        sc.close();

        // s1 object ka salary print karwana hai
        // s1._salary
        System.out.println(s1._salary);
    }
}
