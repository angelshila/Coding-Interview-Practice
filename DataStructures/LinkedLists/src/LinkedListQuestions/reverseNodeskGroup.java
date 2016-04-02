package LinkedListQuestions;

import LinkedListBasics.*;

/**
 * Created by Anushila on 3/15/16.
 */
public class reverseNodeskGroup {


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.appendToTail(1);
        ll.appendToTail(1);
        ll.appendToTail(4);
        ll.appendToTail(5);
        ll.appendToTail(2);
        ll.appendToTail(0);
        ll.appendToTail(0);
        ll.appendToTail(2);

        System.out.println(ll);

        ll.head = reverseKGroup(ll.head,3);
        System.out.println(ll);


    }


    public static Node reverseKGroup(Node head, int k) {
        if(head == null){
            return null;
        }

        int len =0;
        Node p = head;
        while(p!=null){
            p = p.next;
            len++;
        }

        if(k>len){
            return head;
        }

        Node current = head;
        Node prev = null;
        Node next = null;
        int count =0;

        while(count<k && current!=null){

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;

        }

        //next points to the k+1th node
        if(next!=null){
            head.next = reverseKGroup(next,k);
        }


        return prev;


    }
}
