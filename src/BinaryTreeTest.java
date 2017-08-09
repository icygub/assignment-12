import static org.junit.Assert.*;

public class BinaryTreeTest {
    @org.junit.Test
    public void insertNode() throws Exception {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertNode(new CourseOffering(5).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(4).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(3).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(2).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(7).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(6).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(8).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(9).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(1).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(0).getCourseNumber());

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

        binaryTree.inorderTraversal();

    }

    @org.junit.Test
    public void deleteNode() throws Exception {
    }

    @org.junit.Test
    public void findNode() throws Exception {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertNode(new CourseOffering(5).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(4).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(3).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(2).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(7).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(6).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(8).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(9).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(1).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(0).getCourseNumber());

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
    public void inorderTraversal() throws Exception {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertNode(new CourseOffering(5).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(4).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(3).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(2).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(7).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(6).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(8).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(9).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(1).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(0).getCourseNumber());

        binaryTree.inorderTraversal();
    }

    @org.junit.Test
    public void preorderTraversal() throws Exception {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertNode(new CourseOffering(5).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(4).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(3).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(2).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(7).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(6).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(8).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(9).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(1).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(0).getCourseNumber());

        System.out.println("-------------\n");

        binaryTree.preorderTraversal();
    }

    @org.junit.Test
    public void postorderTraversal() throws Exception {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertNode(new CourseOffering(5).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(4).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(3).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(2).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(7).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(6).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(8).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(9).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(1).getCourseNumber());
        binaryTree.insertNode(new CourseOffering(0).getCourseNumber());

        System.out.println("-------------\n");

        binaryTree.postorderTraversal();


    }

}