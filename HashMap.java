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
public class HashMap {
    Node[] nodes;

    public HashMap() {
        nodes = new Node[10000];
    }
    public void put(int key, int val){
        int i = getIdx(key);
        if(nodes[i] == null) nodes[i] = new Node(-1,-1);
        Node prev = find(nodes[i], key);
        if(prev.next == null) prev.next = new Node(key, val);
        else prev.next.val = val;
    }
    public int get(int key){
        int i = getIdx(key);
        if(nodes[i] == null) return -1;
        Node prev = find(nodes[i], key);
        if(prev.next == null) return -1;
        else return prev.next.val;
    }
    public void remove(int key){
        int i = getIdx(key);
        if(nodes[i] == null) return;
        Node prev = find(nodes[i], key);
        if(prev.next == null) return;
        else prev.next = prev.next.next;
    }
    
    
    
    public Node find(Node node, int key){
        Node slow = node, temp = null;
        
        while(slow != null && slow.key != key){
            temp = slow;
            slow = slow.next;
        }
        return temp;
    }
    public int getIdx(int key){
        return key % nodes.length;
    }
    class Node{
        int key, val;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
        
    }
}
