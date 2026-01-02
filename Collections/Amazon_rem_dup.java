import java.util.*;

public class Amazon_rem_dup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> e1 = new ArrayList<>();

        e1.add(new Employee(1));
        e1.add(new Employee(2));
        e1.add(new Employee(2));
        e1.add(new Employee(3));

        TreeSet<Employee> ts = new TreeSet<>(Comparator.comparingInt(Employee::getId));
        ts.addAll(e1);

        for (Employee e : ts) {
            System.out.println(e.id + " " );
        }
        sc.close();
    }
}

class Employee {

    int id;
    // String name;

    Employee(int id) {
        this.id = id;
        // this.name = name;
    }

    int getId() {
        return id;
    }   
}
