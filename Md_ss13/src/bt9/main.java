package bt9;

class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public boolean search(int value) {
        return searchRec(root, value);
    }

    boolean searchRec(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value < current.value) {
            return searchRec(current.left, value);
        } else if (value > current.value) {
            return searchRec(current.right, value);
        } else {
            return true;
        }
    }
}

public class main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        bst.insert(5);
        bst.insert(15);
        bst.insert(25);
        bst.insert(35);

        int searchValue = 25;
        if (bst.search(searchValue)) {
            System.out.println("Phần tử " + searchValue + " được tìm thấy trong cây.");
        } else {
            System.out.println("Phần tử " + searchValue + " không tồn tại trong cây.");
        }
    }
}

