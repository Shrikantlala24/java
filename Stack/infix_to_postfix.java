public class infix_to_postfix {
    public static void main(String[] args) {
        String infix = "(A*(B/C)+D*(C/F)-Z)";
        int len = infix.length();
        int[] stack = new int[len];

        String post = "";
        int top = -1;


        for (int i = 0; i < len; i++) {
            char el = infix.charAt(i);
            // space check
            if (el == ' ') continue;
            // the char or number check
            else if(Character.isLetterOrDigit(el)) {
                post = post + el;
            }

            else if (el == '(') {
                stack[++top] = el;
            }

            else if (el == ')') {
                while (top != -1 && stack[top] != '(') {
                    post = post + (char)stack[top--];
                }
                top--; // pop the '('
            }
            else if 
        }
    }
    
    
    
    
    
    // priority function that returns the precedence of the operator
    public int priority(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } 
        else if (ch == '*' || ch == '/') {
            return 2;
        }
        else if (ch == '^') {
            return 3;
        } 
        else {
            return -1;
        }
    }
}
