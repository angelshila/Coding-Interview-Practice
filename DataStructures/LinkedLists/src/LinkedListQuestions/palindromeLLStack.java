package LinkedListQuestions;

import LinkedListBasics.*;

import java.util.Stack;

/**
 * Created by Anushila on 3/15/16.
 */
public class palindromeLLStack {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.appendToTail(1);
        ll.appendToTail(1);
        ll.appendToTail(4);
        ll.appendToTail(4);
        ll.appendToTail(1);
//        ll.appendToTail(1);

        System.out.println(ll);

        System.out.println(isPalindrome(ll.head));

    }

    private static boolean isPalindrome(Node head) {

        Stack<Node> s = new Stack();

        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){

            s.push(slow);
            slow = slow.next;
            fast = fast.next.next;

        }

        //odd check. Skip middle element
        if(fast!=null){
            slow = slow.next;
        }

        //Start popping and comparing with slow

        while(slow!=null){

            Node top = s.pop();
            if(top.data!=slow.data){
                return false;
            }

            slow = slow.next;

        }


        return true;





    }


}
