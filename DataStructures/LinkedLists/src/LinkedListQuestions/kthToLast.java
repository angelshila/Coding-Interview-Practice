package LinkedListQuestions;

import LinkedListBasics.*;

/**
 * Created by Anushila on 3/13/16.
 */
public class kthToLast {


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


        Node result=kthToLastNode(5,ll.head);
        System.out.println(result.data);

    }

    private static Node kthToLastNode(int k, Node head) {

        Node runner = head;
        Node slow = head;

        for(int i=0;i<k;i++){


            if(runner == null)
                return null;

            runner = runner.next;


        }

        while(runner!=null){
            runner = runner.next;
            slow=slow.next;
        }


        return slow;


    }


}
