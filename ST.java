/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

/**
 *
 * @author Ahshanul Haque <ahshanul.haque@student.nmt.edu>
 */
public class ST {
    public static int capacity, top;
    private static int[] stack;
    public ST(int cap) {
        top = -1;
        this.capacity = cap;
        this.stack = new int[capacity];
    }
    public boolean isEmpty(){
        return top < 0;
    }
    public boolean push(int data){
        if(top >= capacity-1){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            stack[++top] = data;
            return true;
        }
        
    }
    public boolean pop(){
        if(top < 0){
            if(top < 0) System.out.println("Stack underflow");
            return false;
        }
        else{
            int x = stack[top--];
            System.out.println(x);
            return true;
        }
    }
    public void display(){
        for (int i = 0; i <= top; i++) {
            System.out.print("--"+ stack[i]);
            
        }
        System.out.println("");
    }

    
}
