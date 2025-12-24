public class admit_karlo {
    public static void main(String[] args) {
        student s1 = new student("lala", 21);
        s1.Student_details();
        
        // exam wale
        s1.theory();
        s1.prac();

        // admission wale
        s1.fees();
        s1.curr();

        // TPC wale 
        s1.training();
        s1.placemnt();
    }
}

// yahan pe interface define kiye bhosdike

interface exam {
    void theory();
    void prac();
}
interface admission {
    void fees();
    void curr();
}  

interface placement {
    void training();
    void placemnt();

}

// yahan student declare kiya hai jo teeno interface ko implement kar raha hai, lavde

class student implements exam,admission,placement {
    String _name;
    int _age;
    student(String name, int age) {
        this._name = name;
        this._age = age;
    }
    void Student_details () {
        System.out.println("\nName: " + this._name);
        System.out.println("Age: " + this._age + "\n");
    }
    @Override
    public void theory() {
        System.out.println("Theory exam scheduled");
    }

    @Override
    public void prac() {
        System.out.println("Practical exam scheduled");
    }

    @Override
    public void fees() {
        System.out.println("Fees paid");
    }

    @Override
    public void curr() {
        System.out.println("Current syllabus updated");
    }

    @Override
    public void training() {
        System.out.println("Training");
    }

    @Override
    public void placemnt() {
        System.out.println("Placement : hua hi nhi");
    }
    
}