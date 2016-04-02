package Stacks;

/**
 * Created by Anushila on 3/16/16.
 */
public class StackNode<T> {

    public StackNode next;
    public T data;


    public StackNode(T d){

        this.data = d;
        this.next=null;
    }



}
