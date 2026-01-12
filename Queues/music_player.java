public class music_player {
    public static void main(String[] args) {
        queue q = new queue(5);
        q.enqueue("Song1");
        q.enqueue("Song2");
        q.enqueue("Song3");
        q.enqueue("Song4");
        q.enqueue("Song5");

        q.display();
    }

}


class queue {
    String[] arr;

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
        arr = new String[capacity];
    }
    
    // adding elemenrt
    void enqueue(String x) {
        if(isFull()) {
            System.out.println("Queue overflow");
            return;
        }
        arr[++rear] = x;
        size++;
    }
    
    // removing element
    String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return null;
        }
        size--;
        return arr[front++];
    }
    
    // looking the front most element in queue
    String peek() {
        if(isEmpty()) {
            return null;
        }
        return arr[front];
    }
    
    // is Empty
    boolean isEmpty() {
        return size == 0;
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