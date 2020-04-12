package personal.yanchao.geek.algorithm.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * zhuyanchao  2020-04-11
 */
public class LinkedListTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void append() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        System.out.println(list.toString());
    }

    @Test
    public void delete() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        System.out.println(list.toString());
//        list.delete(1);
//        list.delete(2);
//        list.delete(3);
        list.delete(4);
        System.out.println(list.toString());
    }

    @Test
    public void reverse() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        System.out.println(list.toString());
        list.reverse();
        System.out.println(list.toString());
    }

    @Test
    public void contains(){
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        System.out.println(list.contains(1));
        System.out.println(list.contains(2));
        System.out.println(list.contains(3));
        System.out.println(list.contains(4));
    }


}