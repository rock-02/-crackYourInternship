public class FlattenMultiLvelLL {

    /*
     * // Definition for a Node.
     * class Node {
     * public int val;
     * public Node prev;
     * public Node next;
     * public Node child;
     * };
     */

    class Solution {
        public Node flatten(Node head) {

            Node temp = head;

            while (temp != null) {

                Node n = temp.next;

                if (temp.child != null) {
                    Node c = flatten(temp.child);

                    Node l = c;
                    while (l.next != null) {
                        l = l.next;
                    }

                    temp.next = c;
                    c.prev = temp;

                    l.next = n;

                    if (n != null)
                        n.prev = l;

                    temp.child = null;
                }

                temp = n;
            }

            return head;
        }
    }
}
