/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

import java.util.Stack;

/**
 *
 * @author Ahshanul Haque <ahshanul.haque@student.nmt.edu>
 */
public class Qwith2St {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    
//    public void enQ(int n){
//        st1.push(n);
//    
//    }
    public void enQ(int n){
        st1.push(n);
    }
//    public void deQ(){
//        if(st2.isEmpty()){
//            if(st1.isEmpty()){
//                System.out.println("Nothing to pop");
//            }
//            else while(!st1.isEmpty()){
//                st2.push(st1.pop());
//            }
//        }
//        System.out.println(st2.pop());
//    }
    public void deQ(){
        if(st2.isEmpty()){
            if(st1.isEmpty()){
                System.out.println("Q is Empty");
            }
            else{
                while(!st1.isEmpty()){
                    st2.push(st1.pop());
                }
            }
            
            
        }
        st2.pop();
    }
    
}
