import static org.junit.Assert.*;

public class BinaryTreeTest {
    @org.junit.Test
    public void insertNode() throws Exception {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertNode(5);
        binaryTree.insertNode(4);
        binaryTree.insertNode(3);
        binaryTree.insertNode(2);
        binaryTree.insertNode(7);
        binaryTree.insertNode(6);
        binaryTree.insertNode(8);
        binaryTree.insertNode(9);
        binaryTree.insertNode(1);
        binaryTree.insertNode(0);

        binaryTree.findNode(5);
        binaryTree.findNode(4);
        binaryTree.findNode(3);
        binaryTree.findNode(2);
        binaryTree.findNode(7);
        binaryTree.findNode(6);
        binaryTree.findNode(8);
        binaryTree.findNode(9);
        binaryTree.findNode(1);
        binaryTree.findNode(0);

    }

    @org.junit.Test
    public void deleteNode() throws Exception {
    }

    @org.junit.Test
    public void findNode() throws Exception {
    }

    @org.junit.Test
    public void inorderTraversal() throws Exception {
    }

    @org.junit.Test
    public void preorderTraversal() throws Exception {
    }

    @org.junit.Test
    public void postorderTraversal() throws Exception {
    }

}