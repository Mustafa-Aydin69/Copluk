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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode clear = head;
        while(clear != null && clear.next != null){
            if(clear.val == clear.next.val){
                clear.next = clear.next.next;
            } else {
                clear = clear.next;
            }
        }
        return head;
    }
}