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
//public class Multi implements Runnable{
//    @Override
//    public void run(){
//        System.out.println("Thread is running");
//    }
//}
public class Multi extends Thread{
    @Override
    public void run(){
        for(int i = 1; i < 5; i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
        System.out.println("Thread is running");
    }
}
