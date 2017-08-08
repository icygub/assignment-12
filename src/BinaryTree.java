public class BinaryTree {

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public void insertNode(int data, Node recursiveNode) { //recursiveNode should be root node when initally called
        Node node = new Node(data);
        if(isEmpty()) {
            recursiveNode = node;
        } else if(node.data < recursiveNode.data) {
            if(recursiveNode.left == null)
                recursiveNode = node;
            else
                insertNode(node.data, recursiveNode.left);
        } else {
            if(recursiveNode.right == null)
                recursiveNode = node;
            else
                insertNode(node.data, recursiveNode.right);
        }
    }

    public void deleteNode(int data) {

    }

    public boolean findNode(int data) {
        return false;
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
