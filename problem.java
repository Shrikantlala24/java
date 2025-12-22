import java.util.*;

public class problem {
    public static void main(String[] args) {
        // student reuslt manager

        Scanner sc  = new Scanner(System.in);
        
        String name = sc.nextLine();
        int marks = sc.nextInt();
        student s1 = new student(marks, name); 

        s1.check_marks();
        sc.close();


    }
}

// classes for Student, Course, and Result can be added here
class student {
    String name;
    private int _marks ;

    student (int marks, String name) {
        this._marks = marks;
        this.name = name;
    }
    int setMarks() {
        if (this._marks < 0 || this._marks > 100) {
            System.out.println("Invalid marks");
            return 0;

        } else {
            return this._marks;
        }
    }
    void check_marks () {
        if (this._marks >= 40) {
            System.out.println(this.name + " has passed the exam.");
        } else {
            System.out.println(this.name + " has failed the exam.");
        }
    }
}

