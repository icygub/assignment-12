public class BinaryTree {

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public void insertNode(int data) {
        if(isEmpty()) {
            root = new Node(data);
            System.out.println("Root node added");
        }
        else
            insertNode(data, root);

    }

    public void insertNode(int data, Node recursiveNode) { //recursiveNode should be root node when initally called
        Node node = new Node(data);
        if(node.data < recursiveNode.data) {
            if(recursiveNode.left == null)
                recursiveNode.left = node;
            else
                insertNode(node.data, recursiveNode.left);
        } else {
            if(recursiveNode.right == null)
                recursiveNode.right = node;
            else
                insertNode(node.data, recursiveNode.right);
        }
    }

    public void deleteNode(int data) {
        deleteNode(data, root);
    }

    public void deleteNode(int data, Node recursiveNode) {
        //this will probably be the most difficult method to implement
    }

    public void findNode(int data) {
        if(isEmpty())
            System.out.println("The binary tree is empty");
        else if(findNode(data, root))
            System.out.printf("Node(%d) found!%n", data);
        else
            System.out.printf("Node(%d) does not exist.%n", data);
    }

    public boolean findNode(int data, Node recursiveNode) {
        boolean nodeFound;

        if(data == recursiveNode.data) {
            nodeFound = true;
        } else if(data < recursiveNode.data) {
            if(recursiveNode.left == null) {
                return false;
            } else
                nodeFound = findNode(data, recursiveNode.left);
        } else {
            if(recursiveNode.right == null) {
                return false;
            } else
                nodeFound = findNode(data, recursiveNode.right);
        }

        return nodeFound;
    }

    public void inorderTraversal() {

    }

    public void preorderTraversal() {

    }

    public void postorderTraversal() {

    }

    public boolean isEmpty() {
        return root == null;
    }
}
