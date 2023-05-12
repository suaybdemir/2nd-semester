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
public class Merge_sort_basic {
        
    }
    public static void partition(int arr[],int low,int high)
    {
        for (int i = 0; i < (low+high)/2+1 ; i++) {
            for (int j = high-1 ; j >=((low+high)/2); j--) {
                if(arr[i]>arr[j])
                {
                    swap(arr,i,j);
                }
            }
        }
    }
    public static void swap(int arr[],int a,int b)
    {
        int tmp= arr[b];
        arr[b]=arr[a];
        arr[a]=tmp;
    }
    
}
