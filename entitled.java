class entitled {

    public static void main (String[] args) {
        student s1 = new student();
        s1.name = "Shrikant";
        s1.grade = "A";
        s1.print_details();
        System.out.println("grade: " + s1.grade);
    }
}

class person {
    String name;
    void print_details () {
        System.out.println("name: " + name);
    }
}

class teacher extends person {
    String subject;
}
class student extends person{
    String grade;
    void print_details () {
        System.out.println("name: " + name + ", grade: " + grade);
    }
}