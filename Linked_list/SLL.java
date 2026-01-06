public class SLL {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);

        head.display();
    }
}

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
    void display() {
        node current = this;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}