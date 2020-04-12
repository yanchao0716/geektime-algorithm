package personal.yanchao.geek.algorithm.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * zhuyanchao  2020-04-11
 */
public class ListNodeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverse() {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;
        ListNode c = new ListNode(3);
        b.next = c;
        System.out.println(a.toString());

        a = a.reverse(a);
        System.out.println(a.toString());
    }

    @Test
    public void mergeNoRecursion(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(7);
        a.next = b;
        ListNode c = new ListNode(11);
        b.next = c;
        System.out.println(a.toString());


        ListNode a1 = new ListNode(2);
        ListNode b1 = new ListNode(4);
        a1.next = b1;
        ListNode c1 = new ListNode(6);
        b1.next = c1;
        System.out.println(a1.toString());


        ListNode head = ListNode.mergeNoRecursion(a, a1);
        System.out.println(head.toString());
    }

    @Test
    public void mergeByRecursion(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(7);
        a.next = b;
        ListNode c = new ListNode(11);
        b.next = c;
        System.out.println(a.toString());


        ListNode a1 = new ListNode(2);
        ListNode b1 = new ListNode(4);
        a1.next = b1;
        ListNode c1 = new ListNode(6);
        b1.next = c1;
        System.out.println(a1.toString());


        ListNode head = ListNode.mergeByRecursion(a, a1);
        System.out.println(head.toString());
    }

    @Test
    public void isCyclic(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;
        ListNode c = new ListNode(3);
        b.next = c;
        c.next = a;
        System.out.println(ListNode.isCyclic(a));
    }

    @Test
    public void deleteLastNodeByIndex(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;
        ListNode c = new ListNode(3);
        b.next = c;
        System.out.println(a.toString());
        a = ListNode.deleteLastNodeByIndex(a, 3);
        System.out.println(a.toString());
    }

    @Test
    public void findMiddleNode(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;
        ListNode c = new ListNode(3);
        b.next = c;
        System.out.println(a.toString());
        System.out.println(ListNode.findMiddleNode(a).value);
        ListNode d = new ListNode(4);
        c.next = d;
        System.out.println(a.toString());
        System.out.println(ListNode.findMiddleNode(a).value);
    }

}