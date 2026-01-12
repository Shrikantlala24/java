public class customer_queue {
    public static void main(String[] args) {
        queue q1 = new queue(5);
        
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        
        q1.display();
        System.out.println("the dequeued element is " + q1.dequeue());
    }
}
class queue {
    int[] arr;
    int front, rear;
    int capacity, size;
    
    // contrcutor
    queue(int cap) {
        this.capacity = cap;
        int size = 0;
        int front = 0;
        int rear = -1;
        arr = new int[cap];
    }
    // adding
    void enqueue(int data) {
        if (isfull()) {
            System.out.println("queue overflow");
            return;
        }
        arr[++rear] = data;
        size++;
    }
    // deleting
    int dequeue () {
        if(isempty()) {
            System.out.println("queue underflow");
            return -1;
        }
        size--;
        return arr[front++];
    }
    // empty
    boolean isempty() {
        if (rear == -1) {
            return true;
        }
        else return false;
    }
    // full
    boolean isfull() {
        if (rear == capacity - 1) {
            return true;
        }
        else return false;
    }
    // display
    void display() {
        System.out.println("=== Queue Display ===");
        for(int i = front; i < rear; i++) {
            System.out.print(arr[i] + " <- ");
        }
        System.out.print(arr[rear] + "\n");
    }
    // peek
    int peek() {
        return arr[front];
    }
}