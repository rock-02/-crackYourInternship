import java.util.HashMap;
import java.util.Map;

public class copywithandompointeer {

    /*
     * // Definition for a Node.
     * class Node {
     * int val;
     * Node next;
     * Node random;
     * 
     * public Node(int val) {
     * this.val = val;
     * this.next = null;
     * this.random = null;
     * }
     * }
     */

    class Solution {
        public Node copyRandomList(Node head) {
            Map<Node, Node> m = new HashMap<>();

            Node dum = new Node(-1);

            Node dummy = dum;

            Node cur = head;

            while (cur != null) {
                Node t = new Node(cur.val);

                dummy.next = t;
                dummy = t;

                cur = cur.next;
            }

            Node cur2 = dum.next;
            cur = head;

            while (cur != null) {
                m.put(cur, cur2);

                cur2 = cur2.next;

                cur = cur.next;
            }

            for (Node x : m.keySet()) {
                Node x1 = m.get(x);
                Node r1 = m.get(x.random);

                x1.random = r1;

            }

            return dum.next;

        }
    }
}
