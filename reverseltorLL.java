public class reverseltorLL {
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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null)
            return null;

        ListNode dummy = new ListNode(0); // Create a dummy node to handle edge cases
        dummy.next = head;
        ListNode prev = dummy;

        // Move `prev` to the node just before `left`
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode cur = prev.next;
        ListNode next = null;

        // Reverse the sublist from `left` to `right`
        for (int i = 0; i < right - left; i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}
