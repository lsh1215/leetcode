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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tmp = 0; 
        
        // 결과를 담을 리스트의 시작점 (Dummy Node)
        // 나중에 dummy.next를 반환하기 위해 머리를 고정
        ListNode dummy = new ListNode(0);
        ListNode ln = dummy; 

        while(l1 != null || l2 != null || tmp > 0) {
            int sum = tmp; 
            
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; 
            }
            
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; 
            }

            
            tmp = sum / 10;       
            int digit = sum % 10;

            ln.next = new ListNode(digit); 
            ln = ln.next; 
        }
        
        return dummy.next;
    }
}
