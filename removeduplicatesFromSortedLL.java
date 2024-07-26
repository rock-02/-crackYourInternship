public class removeduplicatesFromSortedLL {
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode cur = head.next;
        ListNode nh = head;
        ListNode nhead = nh;

        while (cur != null) {

            if (cur.val != nh.val) {
                nh.next = cur;
                nh = cur;
            }
            cur = cur.next;
        }

        nh.next = null;

        return nhead;
    }
}
