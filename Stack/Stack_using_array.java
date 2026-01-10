public class Stack_using_array {
    public static void main(String[] args) {
        Stack s1 = new Stack(5);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.display();
        System.out.println("Popped element: " + s1.pop());
        System.out.println("Top element: " + s1.peek());
        System.out.println("Stack size: " + s1.size());
        System.out.println("Is stack empty? " + s1.isEmpty());
        System.out.println("Is stack full? " + s1.isFull());

    }
}

class Stack {
    int[] arr;
    int top;
    int capacity;
    Stack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }
    
    // push
    public void push(int val) {
        if(isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = val;
    }
    
    // pop
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack underflow");
            return  -1;
        }
        return arr[top--];
    }
    
    // peek
    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack underflow");
            return  -1;
        }
        return arr[top];
    }
    
    // isEmpty
    public boolean isEmpty() {
        if(top == -1) return true;
        else return false;
    }
    
    // isFull
    public boolean isFull() {
        if(top == capacity - 1) return true;
        else return false;
    }
    
    // size
    public int size() {
        if(isEmpty()) {
            System.out.println("Stack underflow");
            return  -1;
        }
        return top+1;
    }
    
    // display
    public void display() {
        System.out.println("=== Stack ===");
        for(int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    
}