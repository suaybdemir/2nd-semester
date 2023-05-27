/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_examples;

/**
 *
 * @author PC
 */
public class Heap_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int arr[]={2,5,4,1,3};
        int max_index = 0;
        for (int i =1; i < arr.length; i++) 
        {
            if(arr[i]>arr[max_index])
            {
                max_index = i;
            }
        }
        swap(arr,0,max_index);
        heapsort(arr,arr.length,0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void heapsort(int arr[],int high,int s)
    {
        if(s>=10)
        {
            return;
        }
        while(high>1)
        {
            heap(arr,high,s);
            swap(arr,0,arr.length-1);
            high += -1;
        }
    }
    public static void swap(int arr[],int a,int b)
    {
        int tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }
    public static void exchange(int arr[],int i)
    {
            int f = (i+1)/2;
            int s = (2*i)+1;
            int t = (2*i)+2;
            if(arr[s]>arr[t])
            {
                swap(arr,s,t);
            }
            if(arr[f]<arr[t])
            {
                swap(arr,t,f);
            }
    }
    public static void heap(int arr[],int high,int s)
    {
        if(high>1)
        {
            int element=(high/2)-1;
            exchange(arr,element);
            high *= 1/2;
            heapsort(arr,high,s+1);
        }
        
    }
    
}
