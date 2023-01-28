/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

/**
 *
 * @author ☆愛冰漾★
 */
public class HeapSort {
    public static void sort(int[] array){
        int n = array.length;
        for(int i=n/2-1; i>=0; i--){
            heapify(array, n, i);
        }
        for(int i=n-1; i>=0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }
    public static void heapify(int[] array, int n, int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*1 + 2;
        if(left<n && array[left]>array[largest]){
            largest = left;
        }
        if(right<n && array[right]>array[largest]){
            largest = right;
        }
        if(largest!=i){
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            heapify(array, n, largest);
        }
    }
}
