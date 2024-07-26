public class BinToNum {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

    public int getDecimalValue(ListNode head) {
        
        StringBuilder s=new StringBuilder("");

        ListNode cur=head;
        while(cur!=null){
            s.append(cur.val); 
            cur=cur.next;
        }

        s.reverse();
        System.out.println(s);
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                 sum+=Math.pow(2,i);
            }
        }

        return sum;
    }
}
