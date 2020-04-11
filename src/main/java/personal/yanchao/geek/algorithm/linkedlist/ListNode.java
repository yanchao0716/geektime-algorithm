package personal.yanchao.geek.algorithm.linkedlist;

/**
 * zhuyanchao  2020-04-11
 */
public class ListNode {
    final int value;

    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    @Override
    public String toString(){
        StringBuilder stb = new StringBuilder("[");
        ListNode cursor = this;
        while (cursor != null){
            stb.append(cursor.value)
                    .append(",");
            cursor = cursor.next;
        }
        stb.deleteCharAt(stb.length() - 1);
        stb.append("]");
        return stb.toString();
    }
}
