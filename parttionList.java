public class parttionList {

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
    public ListNode partition(ListNode head, int x) {

        ListNode gtx = new ListNode(-1);

        ListNode gt = gtx;

        ListNode ltx = new ListNode(-2);
        ListNode lt = ltx;

        ListNode cur = head;

        while (cur != null) {
            if (cur.val < x) {
                lt.next = cur;
                lt = cur;

            } else {
                gt.next = cur;
                gt = cur;
            }
            cur = cur.next;
        }

        gt.next = null;
        lt.next = gtx.next;

        return ltx.next;

    }
}
