package Stacks;

import java.util.EmptyStackException;

/**
 * Created by Anushila on 3/16/16.
 */
public class MyStack<T> {


    //pop, peek, push, isempty


    public StackNode top;
    public int size;
    public int capacity;


    public MyStack(){

        this.top = null;
        this.size = 0;
        this.capacity =100;


    }

    public MyStack(int capacity){
        this.top = null;
        this.size=0;
        this.capacity = capacity;
    }



    public void push(T data){

        if(size == capacity){
            return;
        }

        StackNode temp = new StackNode(data);

        if(top == null){
            top = temp;
            size++;
        }

        else{

            temp.next = top;
            top = temp;
            size++;

        }


    }

    public StackNode pop(){

        if(size == 0 || capacity == 0){

            throw new EmptyStackException();
        }

        StackNode temp = top;

        top = top.next;
        size--;

        return temp;

    }

    public StackNode peek(){

        if(size == 0 || capacity==0 || top==null){
            throw new EmptyStackException();
        }

        return top;

    }


    public boolean isEmpty(){

        if(size == 0){
            return true;
        }

        return false;

    }




}
