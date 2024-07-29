import java.util.TreeMap;

public class removeDuplicatesLL {
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
    public ListNode deleteDuplicates(ListNode head) {

        TreeMap<Integer, Integer> hm = new TreeMap<>();

        ListNode cur = head;

        while (cur != null) {
            hm.put(cur.val, hm.getOrDefault(cur.val, 0) + 1);
            cur = cur.next;
        }

        ListNode dummy = new ListNode(-1);
        cur = dummy;

        for (Integer x : hm.keySet()) {
            if (hm.get(x) == 1) {
                ListNode L = new ListNode(x);
                cur.next = L;
                cur = L;
            }
        }

        return dummy.next;

    }
}
