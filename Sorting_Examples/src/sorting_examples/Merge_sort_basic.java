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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int arr[]={7,9,8};
        int array[]={5,2,4};
        //partition(arr,0,arr.length);
        partition(array,0,array.length);
        for (int i = 0; i < array.length; i++) {
            //System.out.print("arr dizisi ,"+arr[i]);
            System.out.println("\n array dizisi ,"+array[i]);
        }
        
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
