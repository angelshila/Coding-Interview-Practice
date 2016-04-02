/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Anushila
 */
public class BalancedBrackets {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        for(int i =0;i<t;i++){

            String str = sc.nextLine();

            if(str == null || str.length()==0){
                System.out.println("YES");
                continue;
            }
            Stack<Character> s = new Stack<Character>();
            boolean flag =false;

            for(int j =0;j<str.length();j++){

                if(str.charAt(j)==')'){

                    if(!s.isEmpty() && s.peek()=='('){
                        s.pop();
                    }
                    else{
                        flag = true;
                        break;
                    }

                }

                else if(str.charAt(j)==']'){

                    if(!s.isEmpty() && s.peek()=='['){
                        s.pop();
                    }
                    else{
                        flag = true;
                        break;
                    }

                }

                else if(str.charAt(j)=='}'){

                    if(!s.isEmpty() && s.peek()=='{'){
                        s.pop();
                    }
                    else{
                        flag = true;
                        break;
                    }

                }

                else{

                    s.push(str.charAt(j));

                }

            }

            if(s.isEmpty() && !flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }


    }


}
