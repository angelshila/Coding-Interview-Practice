package Queues;

/**
 * Created by Anushila on 3/16/16.
 */
public class QueueNode<T> {


    T data;
    QueueNode next;

    public QueueNode(T d){
        this.data= d;
        this.next = null;
    }

}
