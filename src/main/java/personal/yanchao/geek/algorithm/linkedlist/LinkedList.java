package personal.yanchao.geek.algorithm.linkedlist;

/**
 * zhuyanchao  2020-04-11
 */
public class LinkedList {
    private ListNode head = null;
    private ListNode tail = null;


    public LinkedList() {
    }

    public void append(int value){
        if(head == null){
            head = new ListNode(value);
            tail = head;
            return;
        }
        tail.next = new ListNode(value);
        tail = tail.next;
    }

    public boolean delete(int value){
        if(head == null){
            return false;
        }
        ListNode pre = null;
        ListNode cursor = head;
        while (cursor != null && cursor.value != value){
            pre = cursor;
            cursor = cursor.next;
        }
        if(cursor != null){
            if(cursor == head){
                head = head.next;
            }else{
                pre.next = cursor.next;
            }
            return true;
        }
        return false;
    }

    public void reverse(){
        if(head != null){
            head = head.reverse(head);
        }
    }

    public boolean contains(int value){
        if(head == null){
            return false;
        }
        while (head != null){
            if(head.value == value){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    @Override
    public String toString() {
        if(head == null){
            return "";
        }
        return head.toString();
    }

}
