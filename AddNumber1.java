public class AddNumber1 {

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l1c = l1;
        ListNode l2c = l2;
        ListNode nh = new ListNode(0);
        ListNode head = nh;
        int sum = 0, car = 0;
        while (l1c != null && l2c != null) {
            sum = l1c.val + l2c.val + car;
            int d = sum % 10;
            car = sum / 10;
            l1c = l1c.next;
            l2c = l2c.next;
            ListNode newl = new ListNode(d);
            nh.next = newl;
            nh = newl;
        }
        while (l1c != null) {
            sum = l1c.val + car;
            int d = sum % 10;
            car = sum / 10;
            l1c = l1c.next;
            ListNode newl = new ListNode(d);
            nh.next = newl;
            nh = newl;
        }
        while (l2c != null) {
            sum = l2c.val + car;
            int d = sum % 10;
            car = sum / 10;
            l2c = l2c.next;
            ListNode newl = new ListNode(d);
            nh.next = newl;
            nh = newl;
        }
        if (car != 0) {
            ListNode nl = new ListNode(car);
            nh.next = nl;
            nh = nl;
        }
        return head.next;
    }

}
