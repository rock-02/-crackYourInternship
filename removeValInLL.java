public class removeValInLL {
    
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        
        head.next=removeElements( head.next,val);
        return head.val==val?head.next:head;
    }


    public ListNode removeElements2(ListNode head, int val) {
        if(head==null) return head;
        
        ListNode cur=head.next;

        ListNode nh=head;

        ListNode newHead=head;

        while(cur!=null){
            if(cur.val != val){
                nh.next=cur;
                nh=cur;
            }
            cur=cur.next;
        }

        nh.next=null;
        return newHead.val==val?newHead.next:newHead;
    }
}
