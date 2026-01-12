class Queue_basic {
    public static void main(String[] args) {
        queue q = new queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

    }
}

class queue {
    int[] arr;

    // thier are two pointers, front and rear.

    int front, rear;
    int capacity;
    int size;
    
    // constructor for initiating queue
    queue(int c) {
        this.capacity = c;
        front = 0;
        rear = -1;
        size = 0;
        arr = new int[capacity];
    }
    
    // adding elemenrt
    void enqueue(int x) {
        if(isFull()) {
            System.out.println("Queue overflow");
            return;
        }
        arr[++rear] = x;
        size++;
    }
    
    // removing element
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        size--;
        return arr[front++];
    }
    
    // looking the front most element in queue
    int peek() {
        if(isEmpty()) {
            return -1;
        }
        return arr[front];
    }
    
    // is Empty
    boolean isEmpty() {
        if (rear == -1) {
            return true;
        } 
        else {
            return false;
        }
    }
    
    // is full 
    boolean isFull() {
        if (rear == capacity - 1) {
            return true;
        } 
        else {
            return false;
        }
    }

    // display the queue
    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}