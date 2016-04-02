package LinkedListQuestions;


import LinkedListBasics.*;

import java.util.*;

/**
 * Created by Anushila on 3/16/16.
 */
public class ReorderLists {


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

        Stack<Node> s = new Stack();

        runner = slow;

        slow = slow.next;

        while(slow!=null){

            s.push(slow);
            slow = slow.next;

        }
        runner.next=null;

        slow = head;

        while(!s.isEmpty()){
            Node next = slow.next;
            Node newNode = s.pop();
            slow.next = newNode;
            newNode.next = next;
            slow = next;
        }


        return head;
    }
    
}
