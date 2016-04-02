package Queues;

import java.util.EmptyStackException;

/**
 * Created by Anushila on 3/16/16.
 */
public class MyQueue<T> {

    public QueueNode front, last;
    public int size;


    public void enqueue(T data){

        QueueNode temp = new QueueNode(data);

        if(last!=null){
            last.next = temp;
        }

        last = temp;
        if(front == null){
            front = last;
        }

        size++;


    }

    public QueueNode dequeue(){

        if(front!=null){

            QueueNode temp = front;
            front = front.next;
            size--;
            return temp;

        }

        if(front == null){
            last = null;
        }

        return null;

    }


    public QueueNode peek(){

        if (front == null) throw new EmptyStackException();

        return front;

    }

    public boolean isEmpty(){

        return front == null;
    }



}
