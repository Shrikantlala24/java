import java.util.*;

class exam {
    private String __username ;
    private String __password ;

    exam(String username, String password) {
        this.__username = username;
        this.__password = password;
    }

    void login(String user_check, String pass_check) {
        if(user_check.equals(this.__username) && pass_check.equals(this.__password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please check your username and password.");
        }
    }
}

public class online_exam_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        exam e1 = new exam("admin", "admin123");
        
        System.out.println("enter valid username");
        String user_check = sc.nextLine();

        System.out.println("enter valid password");
        String pass_check = sc.nextLine();

        e1.login(user_check, pass_check);
    
        sc.close();
    }
}
