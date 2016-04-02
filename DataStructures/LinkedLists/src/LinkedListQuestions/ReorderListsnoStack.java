package LinkedListQuestions;


import LinkedListBasics.Node;

import java.util.Stack;

/**
 * Created by Anushila on 3/16/16.
 */
public class ReorderListsnoStack {


    public static void main(String[] args) {

        LinkedListBasics.LinkedList ll = new LinkedListBasics.LinkedList();
        ll.appendToTail(1);
        ll.appendToTail(2);
        ll.appendToTail(3);
        ll.appendToTail(4);
        ll.appendToTail(5);
        ll.appendToTail(6);
        ll.appendToTail(7);
        ll.appendToTail(8);

        System.out.println(ll);

        ll.head=reorderList(ll.head);
        System.out.println(ll);


    }


    public static Node reorderList(Node head) {

        if(head == null){
            return null;
        }

        Node runner = head;
        Node slow = head;

        while(runner!=null && runner.next!=null){
            slow = slow.next;
            runner = runner.next.next;
        }


        Node secondHead = slow.next;
        slow.next = null;

        //reverse LinkedList
        Node prev = null;
        Node current = secondHead;

        while(current!=null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        secondHead.next=null;

        Node p = prev;
        Node q = head;


        while(p!=null){

            Node next = q.next;
            Node next2 = p.next;
            Node newNode = p;
            q.next=newNode;
            newNode.next = next;
            p = next2;
            q=next;

        }


        return head;
    }
    
}
