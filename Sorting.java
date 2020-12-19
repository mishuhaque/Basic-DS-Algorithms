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
public class Sorting {
/////////////////////////////////Quick Sort/////////////////////////////////////
    public int partition(int[] arr, int l, int h){
        int left = l;
        int pivot = arr[h];
        for(int i = l; i < h; i++){
            if(arr[i] <= pivot){
                swap(arr, i, left++);
            }
        }
        swap(arr, left, h);
        return left;
    }
    private void swap(int[]arr, int i , int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public void QS(int[] arr, int i, int j){
        if(i < j){
            int pi = partition(arr, i, j);
            QS(arr, i, pi - 1);
            QS(arr, pi + 1, j);
        }
    }
////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////Merge Sort/////////////////////////////////////
    private void merge(int[] arr, int l, int m, int h){
        int n1 = m-l+1;
        int n2 = h-m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[i+l];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m+i+1];
        }
        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public void MS(int[] arr, int i, int j){
        if(i < j){
            int mid = (i+j)/2;
            MS(arr, i, mid);
            MS(arr, mid+1, j);
            merge(arr, i, mid, j);
        }
    }
////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////Bubble Sort////////////////////////////////////
    public void BS(int[] arr){
        for(int i = 1; i < arr.length; i++){
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[i]){
                    swap(arr, i, j);
                }
            }
        }
    }
}
////////////////////////////////////////////////////////////////////////////////
