import java.util.List;

import org.w3c.dom.Node;

public class multiplyLL {

    public static ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode cur = head;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public static ListNode MulLLBYDigit(ListNode head, int d) {
        ListNode cur = head;
        ListNode nh = new ListNode(-1);
        ListNode nhead = nh;
        int car = 0;

        while (cur != null) {
            int sum = cur.val * d + car;
            int digit = sum % 10;
            car = sum / 10;

            ListNode newNode = new ListNode(digit);
            nh.next = newNode;
            nh = newNode;
            cur = cur.next;
        }

        if (car != 0) {
            ListNode newNode = new ListNode(car);
            nh.next = newNode;
        }

        // return reverseLL(nhead.next);
        return nhead.next;
    }

    public static void Add2LL(ListNode muList, ListNode ansItr) {
        ListNode l1 = muList;
        ListNode l2 = ansItr;
        int car = 0;

        while (l1 != null || car != 0) {
            int sum = car + (l1 != null ? l1.val : 0) + (l2.next != null ? l2.next.val : 0);
            int digit = sum % 10;
            car = sum / 10;

            if (l2.next != null) {
                l2.next.val = digit;
            } else {
                l2.next = new ListNode(digit);
            }

            if (l1 != null) {
                l1 = l1.next;
            }

            l2 = l2.next;
        }
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(100);

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(3);

        ListNode rh1 = reverseLL(head1);
        ListNode rh2 = reverseLL(head2);

        ListNode current = rh2;
        ListNode ansItr = new ListNode(0); // Start with 0 to avoid null pointer exceptions
        ListNode ansHead = ansItr; // Keep reference to the head

        while (current != null) {
            ListNode ans = MulLLBYDigit(rh1, current.val);
            Add2LL(ans, ansItr);
            ListNode curr = ans;

            while (curr != null) {
                System.out.print(curr.val + " -> ");
                curr = curr.next;
            }

            System.out.println();

            ansItr = ansItr.next; // Move ansItr to the next node for the next iteration
            current = current.next;
        }

        ansHead = reverseLL(ansHead.next); // Skip the initial dummy node

        System.out.println("Answer: ");
        ListNode curr = ansHead; // Skip the initial dummy node

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }

        System.out.println();
    }

    private static final long MOD = 1000000007;

    public static long linkedListToLong(ListNode head) {
        long number = 0;
        while (head != null) {
            number = (number * 10) % MOD + head.val % MOD;
            head = head.next;
            number = number % MOD;
        }
        return number;
    }

    public long multiplyTwoLists(ListNode first, ListNode second) {

        long rh1 = linkedListToLong(first);
        long rh2 = linkedListToLong(second);

        return (long) (rh1 * rh2) % MOD;
        // Code here
    }
}
