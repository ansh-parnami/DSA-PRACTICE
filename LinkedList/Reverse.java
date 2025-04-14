public class Reverse {
    public ListNode reverseList(ListNode head) {
        ListNode node=head;
        ListNode prev=null;
        ListNode next1=head;

        while(next1!=null){
            ListNode new1=next1.next;
            next1.next=prev;
            prev=next1;
            next1=new1;


        }

        return prev;

    }
}
