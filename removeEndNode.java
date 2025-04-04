class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return head;
        }

        int i=1;
        ListNode prev=head;
        int iToFind=size-n;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }

        prev=prev.next.next;
        return prev ;

        
    }
   
}