package LinkedListQuestions;

import LinkedListBasics.*;


/**
 * Created by Anushila on 3/13/16.
 */
public class duplicatesUnsortedLinkedList {

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
        
        removeDups(ll.head);
        System.out.println(ll);

    }

    private static void removeDups(Node head) {

        Node current = head;

        while(current!=null){

            Node runner = current;

            while(runner.next!=null){

                if(runner.next.data == current.data){

                    runner.next = runner.next.next;
                }
                else{
                    runner = runner.next;
                }

            }

            current = current.next;


        }

    }

}
