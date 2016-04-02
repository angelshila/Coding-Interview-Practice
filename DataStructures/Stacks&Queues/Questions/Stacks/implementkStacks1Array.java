package Stacks;

import java.util.EmptyStackException;

/**
 * Created by Anushila on 3/17/16.
 */
public class implementkStacks1Array {


    //stores all data items
    public int arr[];

    //stores k tops
    public int top[];

    //stores next item of each item
    public int next[];

    //stores index of free list
    int free;

    //k stacks
    int k, n;

    public implementkStacks1Array(int k, int n){

        this.n = n;
        this.k = k;

        arr = new int[n];
        top = new int[k];
        next = new int[n];

        for(int i=0;i<next.length;i++){
            next[i]=i+1;
        }

        next[next.length-1]=-1; //no next element

        for(int i =0;i<top.length;i++){

            top[i] = -1;


        }

        //free list starts at index 1
        this.free = 0;


    }

    public void push(int data,int k){


        if(isFull()){
            throw new StackOverflowError("No Space");
        }

        //get index of free list
        int i = free;

        //update index of free list
        free = next[i];

        //next will point to current top
        next[i] = top[k];

        //update top to new element
        top[k]=i;

        //store data
        arr[i] = data;


    }


    public int pop(int k){

        if(isEmpty(k)){
            throw new EmptyStackException();
        }

        //get top of kth stack
        int i = top[k];

        //update top to next element
        top[k] = next[i];

        //setting free index as next[i]
        next[i] = free;

        //get index of free list
        free = i;

        return arr[i];



    }







    public static void main(String args[]){

        // Let us create 3 stacks in an array of size 10
        int k = 3, n = 10;
        implementkStacks1Array ks=new implementkStacks1Array(k, n);

        // Let us put some items in stack number 2
        ks.push(15, 2);
        ks.push(45, 2);

        // Let us put some items in stack number 1
        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);

        // Let us put some items in stack number 0
        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);

        System.out.println("Popped element from stack 2 is "+ks.pop(2));
        System.out.println("Popped element from stack 1 is "+ks.pop(1));
        System.out.println("Popped element from stack 0 is "+ks.pop(0));



    }


    public boolean isFull() {
        return free==-1;
    }

    public boolean isEmpty(int k) {
        return top[k]==-1;
    }
}
