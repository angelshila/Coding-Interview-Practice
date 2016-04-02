package LinkedListBasics;

/**
 * Created by Anushila on 3/13/16.
 */
public class LinkedListDemo {


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.appendToTail(1);
        ll.appendToTail(1);
        ll.appendToTail(4);
        ll.appendToTail(5);
        ll.appendToTail(2);
        ll.appendToTail(0);

        System.out.println(ll);
        System.out.println(ll.size);
        ll.addAt(23,1);
        System.out.println(ll);
        ll.addAt(65,3);
        System.out.println(ll);
        System.out.println(ll.get(6).data);
        System.out.println(ll.get(21));
        System.out.println(ll.deleteTail().data);
        System.out.println(ll.size);
        System.out.println(ll);

        System.out.println(ll.get(6));
        System.out.println(ll.deleteHead().data);
        System.out.println(ll.size);
        System.out.println(ll);
        System.out.println("Blah");
        System.out.println(ll.deletePos(1).data);
        System.out.println(ll.size);
        System.out.println(ll);

        ll.deleteMatched(2);
        System.out.println(ll.size);
        System.out.println(ll);
        ll.appendToTail(22);
        ll.appendToTail(57);
        ll.appendToTail(59);
        System.out.println(ll);
        ll.deleteMatched(22);
        System.out.println(ll);
        System.out.println(ll.deletePos(4).data);
        System.out.println(ll.size);
        System.out.println(ll);
        ll.addHead(150);
        System.out.println(ll);
    }

}



