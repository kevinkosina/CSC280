package module6;

public class BinarySearchTree {

    class Node {
        int value;
        Node left;
        Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        }

    }

    public boolean contains(int value) {
        if (root == null) return false;

        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.right;
            } else if (value > temp.value) {
                temp = temp.right;
            } else return true;
        }
        return false;
    }

    public int minValue(Node root) {
        int minVal = root.value;

        while (root.left != null) {

        }
        return 0;
        //TODO finish
    }

    //TODO write maxValue

    public Node deleteRecursively(Node root, int value) {
        if (root == null) {
            return root;
        }

        if (value > root.value) {
            root.right = deleteRecursively(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                //TODO finish
            }
        }
        //TODO finish
        return root;
    }
    
}


