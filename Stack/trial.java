class trial {

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return -1;
    }

    static String infixToPostfix(String infix) {
        char[] stack = new char[infix.length()];
        int top = -1;

        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (ch == ' ') continue;

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }

            // Opening bracket
            else if (ch == '(') {
                stack[++top] = ch;
            }

            // Closing bracket
            else if (ch == ')') {
                while (top != -1 && stack[top] != '(') {
                    postfix.append(stack[top--]);
                }
                top--; // pop '('
            }

            // Operator
            else {
                while (top != -1 && precedence(stack[top]) >= precedence(ch)) {
                    postfix.append(stack[top--]);
                }
                stack[++top] = ch;
            }
        }

        // Pop remaining operators
        while (top != -1) {
            postfix.append(stack[top--]);
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        String infix = "( A * ( B / C ) + D * ( C / F ) - Z )";
        System.out.println(infixToPostfix(infix)); // ABC/*DCF/*+Z-
    }
}
