public public class BST_trial {
    public static void main(String[] args) {
        tree t = new tree();

        t.insert(50);
        t.insert(30);
        t.insert(70);
        t.insert(20);
        t.insert(40);
        t.insert(60);
        t.insert(80);

        t.inorder();   // 20 30 40 50 60 70 80
        System.out.println();

        t.preorder();  // 50 30 20 40 70 60 80
        System.out.println();

        t.postorder(); // 20 40 30 60 80 70 50
        System.out.println();

        System.out.println(t.search(40)); // true
        System.out.println(t.search(100)); // false
    }
}

class node {
    int data;
    node left, right;

    node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class tree {
    node root;

    // INSERT
    void insert(int data) {
        root = insertRec(root, data);
    }

    node insertRec(node root, int data) {
        if (root == null) return new node(data);

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    // SEARCH
    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;

        if (key < root.data)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }

    // INORDER
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // PREORDER 
    void preorder() {
        preorderRec(root);
    }

    void preorderRec(node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // POSTORDER
    void postorder() {
        postorderRec(root);
    }

    void postorderRec(node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}
