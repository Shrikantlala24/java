class hashtable {
    private int[] table;
    private int capacity;

    public hashtable(int capacity) {
        this.capacity = capacity;
        table = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = -1;
        }
    }

    private int hash(int key) {
        return key % capacity;
    }

    public void insert(int key) {
        int baseIndex = hash(key);
        int i = 0;

        while (table[(baseIndex + i * i) % capacity] != -1) {
            i++;
        }

        int finalIndex = (baseIndex + i * i) % capacity;
        table[finalIndex] = key;
    }
    public 
}
public class Hashing {
    public static void main(String[] args) {
        hashtable ht = new hashtable(11);
        ht.insert(10);
        ht.insert(22);
        ht.insert(31);
        ht.insert(4);
        ht.insert(15);
        ht.insert(28);
        ht.insert(17);
        ht.insert(88);
        ht.insert(59);
    }
}