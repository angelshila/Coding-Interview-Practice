package Stacks;

import java.util.*;

/**
 * Created by Anushila on 3/17/16.
 */
class MinStack extends Stack<Integer>{

    public static Stack<Integer> minStack;
    public MinStack(){
        minStack = new Stack();
    }

    public void push(int x) {
        super.push(x);
        if(x<=getMin()){
            minStack.push(x);
        }

    }

    public Integer pop() {

        int temp = super.pop();
        if(temp == getMin()){
            minStack.pop();
        }
        return temp;

    }

    public int top() {

        return super.peek();

    }

    public static int getMin() {

        if(minStack.isEmpty()){
            return Integer.MAX_VALUE;
        }

        else{
            return minStack.peek();
        }

    }
}
