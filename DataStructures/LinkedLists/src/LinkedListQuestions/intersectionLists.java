///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// */
//
//class Results{
//    public ListNode tail;
//    public int size;
//
//    public Results(ListNode tail, int size){
//        this.tail = tail;
//        this.size = size;
//    }
//}
//public class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//
//        if(headA == null || headB==null){
//            return null;
//        }
//
//        //Check whether tails are same
//        Results result1 = getTailAndSize(headA);
//        Results result2 = getTailAndSize(headB);
//
//
//        //Check if tails are same
//        if(result1.tail!=result2.tail){
//            return null;
//        }
//
//        ListNode longer = result1.size>result2.size? result1:result2;
//        ListNode shorter = result1.size<result2.size? result1:result2;
//
//        //Move longer pointer to same distance as shorter pointer from intersection point
//        longer = getAhead(longer, Math.abs(result1.size-result2.size));
//
//        while(shorter!=longer){
//            shorter = shorter.next;
//            longer = longer.next;
//        }
//
//
//        return longer;
//
//
//    }
//
//    public ListNode getAhead(ListNode head, int k){
//
//        ListNode current = head;
//        while(k>0 && current!=null){
//            current = current.next;
//            k--;
//        }
//        return current;
//
//    }
//
//    public Results getTailAndSize(ListNode list){
//        if(list == null){
//            return null;
//        }
//
//        int size = 1;
//        ListNode current = list;
//
//        while(current.next!=null){
//            size++;
//            current = current.next;
//
//        }
//
//        return new Results(current,size);
//
//    }
//}