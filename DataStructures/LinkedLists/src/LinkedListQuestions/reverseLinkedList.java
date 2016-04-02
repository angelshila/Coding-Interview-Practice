package LinkedListQuestions;

import LinkedListBasics.*;

/**
 * Created by Anushila on 3/15/16.
 */
public class reverseLinkedList {

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

        ll.head = reverseLL(ll.head);
        System.out.println(ll);


    }

    private static Node reverseLL(Node head) {

        if(head == null){
            return null;
        }

        Node current = head;
        Node prev = null;

        while(current!=null){

            Node next = current.next;

            current.next = prev;

            prev = current;
            current = next;


        }


        return prev;



    }


}
