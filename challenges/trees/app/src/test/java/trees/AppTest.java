/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import trees.KAryTree.KTree;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void emptyTree(){
        BinaryTree binaryTree= new BinaryTree();
        assertNull(binaryTree.getRoot());
    }

    @Test
    public void singleRoot(){
        BinaryTree binaryTree= new BinaryTree();
        binaryTree.setRoot(new Node(10));
        assertEquals(10, binaryTree.getRoot().getKey());
    }

    @Test
    public void addChild(){
        BinaryTree binaryTree= new BinaryTree();
        binaryTree.setRoot(new Node(10));

        binaryTree.getRoot().setLeft(new Node(20));
        binaryTree.getRoot().setRight(new Node(30));

        assertEquals(20, binaryTree.getRoot().getLeft().getKey());
        assertEquals(30, binaryTree.getRoot().getRight().getKey());
    }

    @Test
    public void preOrder(){
        BinaryTree binaryTree= new BinaryTree();
        binaryTree.setRoot(new Node(10));

        binaryTree.getRoot().setLeft(new Node(20));
        binaryTree.getRoot().setRight(new Node(30));

        binaryTree.preOrderTraverse(binaryTree.getRoot());

        assertEquals("[10, 20, 30]",binaryTree.getPreOrder()+"");

    }

    @Test
    public void inOrder(){
        BinaryTree binaryTree= new BinaryTree();
        binaryTree.setRoot(new Node(10));

        binaryTree.getRoot().setLeft(new Node(20));
        binaryTree.getRoot().setRight(new Node(30));

        binaryTree.inOrderTraverse(binaryTree.getRoot());

        assertEquals("[20, 10, 30]",binaryTree.getInOrder()+"");

    }

    @Test
    public void postOrder(){
        BinaryTree binaryTree= new BinaryTree();
        binaryTree.setRoot(new Node(10));

        binaryTree.getRoot().setLeft(new Node(20));
        binaryTree.getRoot().setRight(new Node(30));

        binaryTree.postOrderTraverse(binaryTree.getRoot());

        assertEquals("[20, 30, 10]",binaryTree.getPostOrder()+"");

    }

    @Test
    public void findMax(){
        BinaryTree binaryTree= new BinaryTree();

        binaryTree.setRoot(new Node(300));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.getRoot().getLeft().setLeft(new Node(50));
        binaryTree.getRoot().getLeft().setRight(new Node(200));
        binaryTree.getRoot().getRight().setLeft(new Node(150));
        binaryTree.getRoot().getRight().setRight(new Node(90));

        assertEquals(300,binaryTree.findMax(binaryTree.getRoot()));

    }

    @Test
    public void findMaxFailed(){
        BinaryTree binaryTree= new BinaryTree();

        binaryTree.setRoot(new Node(300));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.getRoot().getLeft().setLeft(new Node(50));
        binaryTree.getRoot().getLeft().setRight(new Node(200));
        binaryTree.getRoot().getRight().setLeft(new Node(150));
        binaryTree.getRoot().getRight().setRight(new Node(90));

        assertNotEquals(200,binaryTree.findMax(binaryTree.getRoot()));

    }

    @Test
    public void printLevelOrder(){
        BinaryTree binaryTree= new BinaryTree();

        binaryTree.setRoot(new Node(300));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.getRoot().getLeft().setLeft(new Node(50));
        binaryTree.getRoot().getLeft().setRight(new Node(200));
        binaryTree.getRoot().getRight().setLeft(new Node(150));
        binaryTree.getRoot().getRight().setRight(new Node(90));

        binaryTree.printLevelOrder();

        assertEquals("[300, 2, 3, 50, 200, 150, 90]",binaryTree.getLevelOreder()+"");

    }

    @Test
    public void printLevelOrderFailed(){
        BinaryTree binaryTree= new BinaryTree();

        binaryTree.setRoot(new Node(300));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.getRoot().getLeft().setLeft(new Node(50));
        binaryTree.getRoot().getLeft().setRight(new Node(200));
        binaryTree.getRoot().getRight().setLeft(new Node(150));
        binaryTree.getRoot().getRight().setRight(new Node(90));

        binaryTree.printLevelOrder();

        assertNotEquals("[300, 2, 3, 50, 200, 150]",binaryTree.getLevelOreder()+"");

    }

    @Test
    public void FizzBuzz(){
//        KTree kTree = new KTree();
//        int n = 3;
//        Node root = new Node( 1);
////        root.children[0] = new Node( 2);
////        root.children[1] = new Node( 3);
////        root.children[2] = new Node( 4);
////        root.children[0].children[0] = new Node( 5);
////        root.children[0].children[1] = new Node( 6);
////        root.children[0].children[2] = new Node( 15);
//        assertEquals("Buzz", );
    }
}
