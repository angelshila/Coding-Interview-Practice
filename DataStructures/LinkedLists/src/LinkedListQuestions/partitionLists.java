package LinkedListQuestions;

import LinkedListBasics.LinkedList;
import LinkedListBasics.Node;

/**
 * Created by Anushila on 3/14/16.
 */
public class partitionLists {

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

        Node head = partitionStable(ll.head,2);
        System.out.println(ll);


    }


    public static Node partitionStable(Node head, int x){

        //Edge Case
        if(head == null){
            return null;
        }


        //Creating two lists, each one with a head and tail
        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;


        //Partitioning
        while(head!=null){

            Node next = head.next;
            head.next = null;

            //insert to end of before list
            if((int)head.data<x){

                if(beforeStart == null){
                    beforeStart = head;
                    beforeEnd = beforeStart;
                }
                else{
                    beforeEnd.next = head;
                    beforeEnd = head;
                }

            }

            //Add to end of after list
            else{

                if(afterStart == null){

                    afterStart = head;
                    afterEnd = afterStart;
                }
                else{
                    afterEnd.next = head;
                    afterEnd = head;
                }
            }

            head = next;
        }

        if(beforeStart == null){
            return afterStart;
        }

        beforeEnd.next = afterStart;

        return beforeStart;
    }

}
