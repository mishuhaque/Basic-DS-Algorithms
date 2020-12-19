/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

import java.util.Random;

/**
 *
 * @author Ahshanul Haque
 */
public class TP {
    int data;
    int priority;
    TP left, right;

    public TP(int data) {
        this.data = data;
        this.priority = new Random().nextInt(100);
        this.left = this.right = null;
    }
    
    
}
class Treap{
    public TP leftRotate(TP root){
        TP R = root.right;
        TP X = root.right.left;
        
        R.left = root;
        root.right = X;
        
        return R;
    }
    public TP rightRotate(TP root){
        TP L = root.left;
        TP X = root.left.right;
        
        L.right = root;
        root.left = X;
        
        return L;
    }
    public TP insertNode(TP root, int data){
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
}
