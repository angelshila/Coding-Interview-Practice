package Stacks.stackOfPlates;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Created by Anushila on 3/18/16.
 */

public class SetOfStacks {

    //We need an arraylist of stacks
    ArrayList<MyStack> stacks = new ArrayList<>();
    public int capacity;


    public SetOfStacks(int capacity){

        this.capacity = capacity;

    }

    public static void main(String[] args) {
        int capacity_per_substack = 5;
        SetOfStacks set = new SetOfStacks(capacity_per_substack);
        for (int i = 0; i < 34; i++) {
            set.push(i);
        }
        for (int i = 0; i < 34; i++) {
            System.out.println("Popped " + set.pop());
        }
    }

    //push function
    public void push(int value){

        MyStack last = getLastStack();
        if(last!=null && !last.isFull()){
            last.push(value);
        }

        //create a new stack
        else{

            MyStack stack = new MyStack(capacity);
            stack.push(value);
            stacks.add(stack);
        }

    }

    public int pop(){

        MyStack last = getLastStack();
        if(last == null){
            throw  new EmptyStackException();
        }
        int value = last.pop();

        if(last.isEmpty()){
            stacks.remove(stacks.size()-1);
        }
        return value;


    }

    public int popAt(int stackIndex){

        return rollover(stackIndex,true);



    }

    private int rollover(int stackIndex, boolean removeTop) {

        if(stackIndex>=stacks.size()){
            throw new EmptyStackException();
        }

        else{

            //getting the required stack
            MyStack stack = stacks.get(stackIndex);
            int removedItem;

            //popping at a particular stack
            if(removeTop){
                removedItem = stack.pop();
            }

            //performing rollover
            else{
                removedItem = stack.removeBottom();
            }

            if(stack.isEmpty()){
                stacks.remove(stackIndex);
            }
            //another stack is there after this one
            else if(stacks.size()>stackIndex+1){

                int v = rollover(stackIndex+1,false);
                stack.push(v);

            }

            return removedItem;

        }

    }


    public MyStack getLastStack() {

        if(stacks.size()!=0){
            return stacks.get(stacks.size()-1);
        }
        return null;
    }

    public boolean isEmpty(){

        return stacks.size()==0;

    }

}
