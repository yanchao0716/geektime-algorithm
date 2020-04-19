package personal.yanchao.geektime.algorithm.linkedlist;

/**
 * zhuyanchao  2020-04-11
 */
public class ListNode {
    final int value;

    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder("[");
        ListNode cursor = this;
        while (cursor != null) {
            stb.append(cursor.value)
                    .append(",");
            cursor = cursor.next;
        }
        stb.deleteCharAt(stb.length() - 1);
        stb.append("]");
        return stb.toString();
    }

    public static boolean isCyclic(ListNode head) {
        boolean moved = false;
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null) {
            if (slow == fast) {
                if (moved) {
                    return true;
                }
                moved = true;
            }
            slow = slow.next;
            fast = fast.next == null ? fast.next : fast.next.next;
        }
        return false;
    }

    public static ListNode mergeNoRecursion(ListNode list1, ListNode list2) {
        ListNode head;
        ListNode tail;
        if (list1.value < list2.value) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        tail = head;
        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = list1 == null ? list2 : list1;
        return head;
    }

    public static ListNode mergeByRecursion(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        ListNode head = null;
        if (list1.value <= list2.value) {
            head = list1;
            head.next = mergeByRecursion(list1.next, list2);
        } else {
            head = list2;
            head.next = mergeByRecursion(list1, list2.next);
        }
        return head;
    }

    /**
     * 删除链表的倒数第N个节点
     * 思路：right指针间隔left指针index个元素，然后left、right一起后移，当right为null时left刚好指向要删除的节点
     *
     * @param list
     * @param index
     * @return
     */
    public static ListNode deleteLastNodeByIndex(ListNode list, int index) {
        if (list == null) {
            return null;
        }
        ListNode left = list;
        ListNode right = list;
        // 循环结束让left指向要删除的前一个节点
        while (--index >= 0 && right.next != null) {
            right = right.next;
        }
        // 链表长度 < index
        if (index > 0) {
            return null;
        }
        while (right.next != null) {
            left = left.next;
            right = right.next;
        }
        if (index < 0) {
            left.next = left.next == null ? null : left.next.next;
        } else {
            list = list.next;
        }
        return list;
    }

    public static ListNode findMiddleNode(ListNode list) {
        if (list == null || list.next == null) {
            return list;
        }
        ListNode slow = list;
        ListNode fast = list;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
