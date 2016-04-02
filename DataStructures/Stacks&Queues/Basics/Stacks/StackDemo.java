/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

/**
 *
 * @author Anushila
 */
public class StackDemo {

    public static void main(String[] args) {

        MyStack sq = new MyStack();

        sq.push(4);
        sq.push(5);
        sq.push(5);
        sq.push(6);
        sq.push(100);

        System.out.println(sq.peek().data);
        System.out.println(sq.pop().data);
        System.out.println(sq.peek().data);
        System.out.println(sq.size);


    }

}
