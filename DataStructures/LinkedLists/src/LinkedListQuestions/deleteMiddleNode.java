package LinkedListQuestions;

import LinkedListBasics.*;

/**
 * Created by Anushila on 3/13/16.
 */
public class deleteMiddleNode {


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

        System.out.println(deleteMiddleNode(ll.head.next.next.next));
        System.out.println(ll);

    }

    public static boolean deleteMiddleNode(Node n){

        if(n==null ||n.next == null){
            return false;
        }

        Node next = n.next;
        n.data = next.data;
        n.next = next.next;

        return true;
    }

}
