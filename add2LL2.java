public class add2LL2 {
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

    public ListNode reverse(ListNode head) {
        ListNode cur = head, prev = null, next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    ListNode add2LL(ListNode l1, ListNode l2) {

        ListNode h1 = l1;
        ListNode h2 = l2;

        ListNode dummy = new ListNode(-1);

        ListNode cur = dummy;
        int car = 0;

        while (h1 != null || h2 != null || car != 0) {

            int sum = car + (h1 != null ? h1.val : 0) + (h2 != null ? h2.val : 0);

            int digit = sum % 10;

            car = sum / 10;

            ListNode l = new ListNode(digit);

            cur.next = l;
            cur = l;
            if (h1 != null)
                h1 = h1.next;

            if (h2 != null)
                h2 = h2.next;
        }

        return dummy.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head1 = reverse(l1);

        ListNode head2 = reverse(l2);

        return reverse(add2LL(head1, head2));

    }
}
