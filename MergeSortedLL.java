public class MergeSortedLL {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode ln = new ListNode(0);

        ListNode head = ln;

        ListNode l1 = list1;

        ListNode l2 = list2;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ln.next = l1;
                ln = l1;
                l1 = l1.next;
            } else {
                ln.next = l2;
                ln = l2;
                l2 = l2.next;
            }
        }

        while (l1 != null) {
            ln.next = l1;
            ln = l1;
            l1 = l1.next;
        }

        while (l2 != null) {
            ln.next = l2;
            ln = l2;
            l2 = l2.next;
        }

        ln.next = null;

        return head.next;
    }
}
