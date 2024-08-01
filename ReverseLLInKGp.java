public class ReverseLLInKGp {
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
    class Solution {

        static ListNode tempHead = null, tempTail = null;

        void addFirst(ListNode t) {

            if (t == null)
                return;

            if (tempHead == null) {
                tempHead = t;
                tempTail = t;
            }

            t.next = tempHead;
            tempHead = t;
        }

        public ListNode reverseKGroup(ListNode head, int k) {

            if (head == null || head.next == null || k == 0)
                return head;
            ListNode ohead = null, otail = null;

            ListNode cur = head;
            int l = 0;

            while (cur != null) {
                l++;
                cur = cur.next;
            }

            cur = head;

            while (l >= k) {
                int c = k;
                while (c-- > 0) {
                    ListNode next = cur.next;
                    cur.next = null;
                    addFirst(cur);
                    cur = next;
                }

                if (ohead == null) {
                    ohead = tempHead;
                    otail = tempTail;
                } else {
                    otail.next = tempHead;
                    otail = tempTail;
                }
                tempHead = null;
                tempTail = null;

                l -= k;
            }

            otail.next = cur;

            tempHead = null;
            tempTail = null;

            return ohead;
        }
    }
}
