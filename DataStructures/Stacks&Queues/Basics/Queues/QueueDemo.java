package Queues;

/**
 * Created by Anushila on 3/16/16.
 */
public class QueueDemo {


    public static void main(String[] args) {

        MyQueue q = new MyQueue();
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println(q.peek().data);
        System.out.println(q.dequeue().data);
        System.out.println(q.peek().data);
        q.enqueue(7);
        System.out.println(q.peek().data);


    }

}
