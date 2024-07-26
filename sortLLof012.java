public class sortLLof012 {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next.next.next = new ListNode(1);

        ListNode cur = head;

        int a[] = new int[3];

        while (cur != null) {
            a[cur.val]++;
            cur = cur.next;
        }

        cur = head;

        while (cur != null) {
            if (a[0] > 0) {
                cur.val = 0;
                a[0]--;
            } else if (a[1] > 0) {
                cur.val = 1;
                a[1]--;
            } else {
                cur.val = 2;
            }
            cur = cur.next;
        }

        cur = head;

        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }
}
