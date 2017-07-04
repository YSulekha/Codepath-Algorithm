package Checkpoint3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aharyadi on 7/4/17.
 */
public class KthSmallest {
    public static void main(String [] args){
        KthSmallest p = new KthSmallest();
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(1);
        a.add(4);
        a.add(3);
        a.add(2);
        System.out.println(p.kthsmallest(a,3));
    }

    public int kthsmallest(final List<Integer> a, int k) {

        return findSmallest(a,k);
    }


    public void heapify(int[] a, int i,int size){
        int left = i*2+1;
        int rgt = i*2+2;
        int largest = i;
        if(left < size && a[left] > a[largest]){
            largest = left;
        }
        if(rgt < size && a[rgt] > a[largest]){
            largest = rgt;
        }
        if(largest != i){
            swap(a,i,largest);
            heapify(a,largest,size);
        }
    }
    void swap(int[] a, int a1,int a2){
        int temp = a[a1];
        a[a1] = a[a2];
        a[a2] = temp;
    }
    public void buildHeap(int[] minHeap,int k){
        for(int i = k/2;i>=0;i--){
            heapify(minHeap,i,k);
        }
    }

    public int findSmallest(List<Integer> a,int k){
        int[] minHeap = new int[k];
        for(int i=0;i<k;i++){
            minHeap[i] = a.get(i);
        }
        buildHeap(minHeap,k);
        for(int j = k;j < a.size();j++){
            if(a.get(j) < minHeap[0]){
                minHeap[0] = a.get(j);
                heapify(minHeap,0,k);
            }
        }
        return minHeap[0];
    }
}
