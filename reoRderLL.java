public class reoRderLL {

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

    ListNode mdle(ListNode head) {

        ListNode fast = head, slow = head, prev = slow;
        ;

        int l = 0;

        while (slow != null) {
            slow = slow.next;
            l++;
        }

        slow = head;
        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        if (l % 2 == 0)
            slow = prev;
        return slow;
    }

    ListNode reverse(ListNode head) {
        ListNode prev = null, cur = head, next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public void reorderList(ListNode head) {

        ListNode mid = mdle(head);
        ListNode te = mid.next;
        mid.next = null;
        ListNode rend = reverse(te);
        ListNode curend = head;
        while (curend != null) {
            System.out.print(curend.val + "-> ");
            curend = curend.next;
        }
        ListNode s = head;

        ListNode e = rend;
        int c = 1;
        ListNode dummy = new ListNode(-1);

        ListNode nh = dummy;
        while (s != null && e != null) {
            if (c % 2 == 0) {
                nh.next = e;
                nh = e;
                e = e.next;
            } else {
                nh.next = s;
                nh = s;
                s = s.next;
            }
            c++;

        }

        while (s != null) {
            nh.next = s;
            nh = s;
            s = s.next;
        }

        while (e != null) {
            nh.next = e;
            nh = e;
            e = e.next;

        }

        head = dummy.next;

    }
}
