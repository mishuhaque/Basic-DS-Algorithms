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
public class Q {
    private static int front, rear, capacity;
    private static int[] q;

    public Q(int cap) {
        front = rear = 0;
        this.capacity = cap;
        q = new int[capacity];
    }
    
    public void enQ(int data){
        if(rear == capacity){
            System.out.println("Q is full");
        }
        else{
            q[rear] = data;
            rear++;
        }
        return;
    }
    public void deQ(){
        if(front == rear){
            System.out.println("Q is Empty");
        }
        else{
            for (int i = 0; i < rear-1; i++) {
                q[i] = q[i+1];
            }
        }
        if(rear < 0){
            q[rear] = 0;
        }
        rear--;
        return;
    }
    public void display(){
        if(front == rear){
            System.out.println("Q is Empty");
        }
        for(int i = front; i < rear; i++){
            System.out.printf("--"+ q[i]);
        
        }
        return;
    }
    
    
}
