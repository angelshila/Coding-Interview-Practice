package LinkedListQuestions;

import LinkedListBasics.*;

/**
 * Created by Anushila on 3/14/16.
 */
public class palindromeLinkedList {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.appendToTail(1);
        ll.appendToTail(1);
        ll.appendToTail(4);
        ll.appendToTail(1);
        ll.appendToTail(1);
//        ll.appendToTail(1);

        System.out.println(ll);

        System.out.println(isPalindrome(ll.head));

    }


    public static boolean isPalindrome(Node head) {

        if(head == null || head.next == null){
            return true;
        }

        Node slow = head;
        Node runner = head;


        while(runner.next!=null && runner.next.next!=null){
            runner = runner.next.next;
            slow = slow.next;
        }

        Node secondHead = slow.next;
        slow.next = null;

        //Reverse linkedList
        Node prev = null;
        Node current = secondHead;

        while(current!=null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        secondHead.next = null;
        Node p = prev;
        Node q = head;

        while(p!=null){

            if(p.data!=q.data){
                return false;
            }

            p=p.next;
            q=q.next;

        }

        return true;


    }
    
    
    
}
