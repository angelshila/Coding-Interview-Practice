package Stacks.stackOfPlates;

import java.util.EmptyStackException;

/**
 * Created by Anushila on 3/18/16.
 */
public class MyStack {

    public Node top;
    public Node bottom;
    public int capacity;
    public int size;


    public MyStack(int capacity){

        this.bottom = null;
        this.capacity = capacity;
        this.size=0;
        this.top = null;
    }


    public boolean isEmpty() {

        return size == 0;
    }

    public void push(int value) {

        if(size >= capacity){
            throw new StackOverflowError();
        }
        size++;
        Node n = new Node(value);

        //Node at the bottom of a stack if size is 1
        if(size == 1){
            bottom = n;
        }

        //Stitching the previous node i.e. top and the current new node
        join(n,top);
        top = n;

    }

    private void join(Node above, Node below) {

        if(below!=null){
            below.above = above;
        }

        if(above!=null){
            above.below = below;
        }

    }

    public boolean isFull() {
        return size == capacity;
    }

    public int pop() {

        if(size!=0){

            Node t = top;
            top = top.below;
            size--;
            return t.data;
        }
        else{
            throw new EmptyStackException();
        }

    }

    public int removeBottom() {

        Node b = bottom;
        if(bottom!=null){
            bottom = bottom.above;
            bottom.below=null;
            size--;
        }

        return bottom.data;

    }
}
