public class Link_list {
    public static void main(String[] args) {
        
    }
}

class node {
    int data;
    node next;
    
    node(int data) {
        this.data = data;
        // here you'll point to null right now, which could be changed depending on what's
        // the next node;
        this.next = null;
    }
}
class Linked_List {

    node head;
    
    // let's create methods only adding an element :-
    
    // add at the start and at the end 
    void add_start(int data) {
        node n1 = new node(data);
        n1.next = head;
        head = n1;
    }

    void add_end(int data) {
        node n1 = new node(data);
        if (head == null) {
            head = n1;
        } 
        else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n1;
        }
    }
}