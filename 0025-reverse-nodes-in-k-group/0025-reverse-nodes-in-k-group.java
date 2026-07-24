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
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(-1);
        ListNode groupPrev = dummy;
        dummy.next=head;


        while(true){

            ListNode Kth = getKth(groupPrev,k);

            if(Kth==null) break;

            ListNode nextGroup = Kth.next;

            ListNode curr = groupPrev.next;
            ListNode prev = nextGroup;

            while(curr!=nextGroup){
                ListNode temp = curr.next;
                curr.next=prev;
                prev = curr;
                curr = temp;
            }
            ListNode temp = groupPrev.next;

            groupPrev.next = Kth;

            groupPrev = temp;
        }
        return dummy.next;
    }

    ListNode getKth(ListNode curr , int k){

        while(curr!=null && k >0){
            curr = curr.next;
            k--;
        }
        return curr;
        
    }
}