package Queues;
import java.util.*;

/**
 * Created by Anushila on 3/17/16.
 */
public class ImplementQusingStacks {

    public static Stack<Integer>s1;
    public static Stack<Integer> s2;

    public ImplementQusingStacks(){
        s1 = new Stack();
        s2 = new Stack();
    }

    // Push element x to the back of queue.
    public void push(int x) {
        s2.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        shiftStacks();
        s1.pop();
    }

    // Get the front element.
    public int peek() {
        shiftStacks();
        return s1.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {

        return (s1.size() + s2.size())==0;

    }

    public void shiftStacks(){

        if(s1.isEmpty()){

            while(!s2.isEmpty()){

                s1.push(s2.pop());
            }

        }


    }
}