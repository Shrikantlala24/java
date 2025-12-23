// package OOP java;
// import java.util.*;

// import miscellaneous.student;

class student{
    private int _marks ;

    student(int marks) {
        this._marks = marks;
    }
    public void getter() {
        // return _marks;
        System.out.println("Marks: " + this._marks);
    }
    public void setter(int marks) {
        this._marks = marks;
        System.out.println("Marks are update\n");
    }
}

public class Marks_main {
    public static void main(String[] args) {


        student s1 = new student(85);
        s1.getter();
        s1.setter(95);
    }
}
