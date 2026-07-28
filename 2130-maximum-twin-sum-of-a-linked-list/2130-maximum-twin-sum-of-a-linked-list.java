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
    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr  = slow;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        int max_sum = 0;
        ListNode rev_list_head = prev;

        while(rev_list_head!=null){
            max_sum = Math.max(max_sum,(head.val+rev_list_head.val));
            rev_list_head = rev_list_head.next;
            head = head.next;
        }
        return max_sum;
        
    }
}