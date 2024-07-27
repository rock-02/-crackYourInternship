public class PalLinkedlIst {
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
    public boolean isPalindrome(ListNode head) {

        int l = 0;
        ListNode cur = head;
        while (cur != null) {
            l++;
            cur = cur.next;
        }

        int c = 0;

        cur = head;

        ListNode prev = null;
        ListNode next = null;

        while (cur != null && c < l / 2) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            c++;
        }

        ListNode head1 = null;
        ListNode head2 = null;

        head1 = prev;

        if (l % 2 != 0) {
            head2 = cur.next;
        } else {
            head2 = cur;
        }

        while (head1 != null && head2 != null) {
            if (head1.val != head2.val)
                return false;

            head1 = head1.next;

            head2 = head2.next;
        }

        return true;

    }
}
