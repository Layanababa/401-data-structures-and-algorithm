package linkedList;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

@Test
    public void addLast(){
        var list= new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
    }

   @Test public void includesTest(){
        var list= new LinkedList();
       list.addLast(10);
       list.addLast(20);
       list.addLast(30);
       list.addLast(40);
       Assertions.assertTrue(list.includes(10),"Should return true");
       Assertions.assertFalse(list.includes(90),"Should return false");
    }

    @Test public void headTest(){
        var list= new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        Assertions.assertEquals(10, list.getFirst());

    }

    @Test
    public void toStringTest(){
    var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.addFirst(0);
        list.addFirst(-10);
        list.addFirst(-20);
        list.addFirst(-30);
        Assertions.assertEquals("{ -30 } -> { -20 } -> { -10 } -> { 0 } -> { 10 } -> { 20 } -> { 30 } -> { 40 } -> NULL",list.toString());
    }

    @Test public void insertBeforeTest(){
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.addFirst(0);
        list.addFirst(-10);
        list.addFirst(-20);
        list.addFirst(-30);

        list.insertBefore(0,-5);
        Assertions.assertEquals("{ -30 } -> { -20 } -> { -10 } -> { -5 } -> { 0 } -> { 10 } -> { 20 } -> { 30 } -> { 40 } -> NULL",list.toString());

    }

    @Test public void insertAfterTest(){
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.addFirst(0);
        list.addFirst(-10);
        list.addFirst(-20);
        list.addFirst(-30);

        list.insertAfter(0,-5);
        Assertions.assertEquals("{ -30 } -> { -20 } -> { -10 } -> { 0 } -> { -5 } -> { 10 } -> { 20 } -> { 30 } -> { 40 } -> NULL",list.toString());

    }

    @Test
    public void printKTest(){
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.addFirst(0);
        list.addFirst(-10);
        list.addFirst(-20);
        list.addFirst(-30);

        list.printk(10);
        list.printk(0);
        list.printk(-5);
//        Assertions.assertEquals();
    }

    @Test
    public void printKPositiveTest(){
        var list = new LinkedList();
        list.addLast(10);



        list.printk(0);

//        Assertions.assertEquals();
    }

    @Test
    public void ziplistTest(){
        var list = new LinkedList();
        var list2 = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list2.addLast(1);
        list2.addLast(2);
        list2.addLast(3);
        Assertions.assertEquals("{ 10 } -> { 1 } -> { 20 } -> { 2 } -> { 30 } -> { 40 } -> NULL",list.zipLists(list2).toString());
    }
}
