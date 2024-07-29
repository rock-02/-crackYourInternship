public class zigzagList {

    public static ListNode mdlenode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode zigzag(ListNode head) {

        ListNode mid = mdlenode(head);
        ListNode l1 = head;

        ListNode l2 = mid.next;

        mid.next = null;

        ListNode dummy = new ListNode(-1);
        ListNode c1 = l1, c2 = l2, c = dummy;

        int count = 1;

        while (c1 != null && c2 != null) {
            if (count % 2 == 1) {
                c.next = c1;
                c1 = c1.next;
            } else {
                c.next = c2;
                c2 = c2.next;
            }
            c = c.next;
            count++;
        }

        if (c1 != null) {
            c.next = c1;
        }

        if (c2 != null) {
            c.next = c2;
        }

        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(5);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode res = head;
        while (res != null) {
            System.out.print(res.val + "-> ");
            res = res.next;
        }
        System.out.println();
        res = zigzag(head);

        while (res != null) {
            System.out.print(res.val + "-> ");
            res = res.next;
        }
    }

}
