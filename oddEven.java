public class oddEven {
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
    public ListNode oddEvenList(ListNode head) {

        ListNode odd = new ListNode(-1);
        ListNode cur = head;

        ListNode even = new ListNode(-1);

        ListNode l2 = even, l1 = odd;

        int c = 1;

        while (cur != null) {
            if (c % 2 == 0) {
                l2.next = cur;
                l2 = cur;
            } else {
                l1.next = cur;
                l1 = cur;
            }
            cur = cur.next;
            c++;
        }

        l2.next = null;

        even = even.next;

        l1.next = even;

        return odd.next;

    }
}
