/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Ahshanul Haque <ahshanul.haque@student.nmt.edu>
 */
public class Inter {
    public static TP leftRotate(TP root){
        TP R = root.right;
        TP X = root.right.left;
        
        R.left = root;
        root.right = X;
        
        return R;
    }
    public static TP rightRotate(TP root){
        TP L = root.left;
        TP X = root.left.right;
        
        L.right = root;
        root.left = X;
        
        return L;
    }
    public static TP insertNode(TP root, int data){
        if(root == null){
            root = new TP(data);
            return root;
        }
        if(root.data > data){
            root.left = insertNode(root.left, data);
            if(root.left != null && root.left.priority > root.priority){
                root = rightRotate(root);
            }
        }
        else{
            root.right = insertNode(root.right, data);
            if(root.right != null && root.right.priority > root.priority){
                root = leftRotate(root);
            }
        }
        return root;
    }
    public static void printTreap(TP root, int space)
	{
		final int height = 10;

		// Base case
		if (root == null) {
			return;
		}

		// increase distance between levels
		space += height;

		// print right child first
		printTreap(root.right, space);
		System.lineSeparator();

		// print current node after padding with spaces
		for (int i = height; i < space; i++) {
			System.out.print(' ');
		}

		System.out.println(root.data + "(" + root.priority + ")");

		// print left child
		System.lineSeparator();
		printTreap(root.left, space);
	}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        try (       int[] arr = {10,2,9,8,3,2,1};
//        Sorting ms = new Sorting();
//        ms.QS(arr, 0, arr.length-1);
//        
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        HashMap map = new HashMap();
//        map.put(1, 3);
//        map.put(22, 14);
//        map.put(2, 6);
//        map.put(22, 5);
////        map.remove(22);
//        
//        System.out.println(map.get(22));
//        System.out.println(map.get(22));
//        Qwith2St nn = new Qwith2St();
//        
//        nn.enQ(5);
//        nn.enQ(10);
//        nn.enQ(600);
//        nn.enQ(11);nn.enQ(60101010);
//        nn.enQ(22);
//
//
//
//
//        
//        nn.deQ();
//        nn.deQ();
//        nn.deQ();
//        ST st = new ST(3);
//        st.push(10);
//        st.push(100);
//        st.push(11);
//        st.push(14);
//        st.display();
//        st.pop();
//        st.push(144);
//        st.display();
//    Multi t1 = new Multi();
//    Thread t2 = new Thread(t1);
//    t2.start();
//    Multi m1 = new Multi();
//    Multi m2 = new Multi();
//    m1.start();
//    m2.start();
//        FileWriter fw = new FileWriter("output.txt")) {
//            fw.write("141516");
//        }
//        int ch;
//        
//        FileReader fr = null;
//        try{
//            fr = new FileReader("output.txt");
//        }
//        catch(FileNotFoundException fe){
//            System.out.println("File not found");
//        }
//        while((ch = fr.read()) != -1){
//            System.out.println((char) ch);
//        }
//        fr.close();
//////////////////////////////////Treap/////////////////////////////////////////
//        int[] arr = {2,3,4,5,6,7};
//        
//        TP root = null;
//        
//        for(int a : arr){
//            root = insertNode(root, a);
//        }
//        printTreap(root, 0);
////////////////////////////////////////////////////////////////////////////////      
//        int[] arr = new int[]{99,34,13,-1,0,32,35,2,1};
//        
//        Sorting ms = new Sorting();
//        
//        ms.BS(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
