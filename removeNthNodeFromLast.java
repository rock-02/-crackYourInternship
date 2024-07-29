public class removeNthNodeFromLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int l = 1;

        ListNode cur = head, prev = null;

        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
            l++;
        }

        int p = l - n + 1;

        if (p == 1) {
            return head.next;
        }
        if (n == 1) {
            prev.next = null;
            return head;
        }

        cur = head;
        int c = 0;
        while (cur != null && c < p - 1) {
            prev = cur;
            cur = cur.next;
            c++;
        }
        System.out.println(cur.val);
        System.out.println(prev.val);

        prev.next = cur.next;
        return head;
    }
}
