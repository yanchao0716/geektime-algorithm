package personal.yanchao.geek.algorithm.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
}