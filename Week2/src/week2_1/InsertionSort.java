/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_1;

/**
 *
 * @author PC
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arr[]={1,9,3,7,5};
        insertionsort(arr);
        
    }
    public static void insertionsort(int arr[])
    {
        int j,tmp ;
        for (int i = 1; i < arr.length; i++) {
            j = i-1;
            tmp = arr[i];
            while( (j>-1) && (arr[j]>tmp) )
            {
                arr[j+1]=arr[j];
                j--;
                arr[j+1]=tmp;
            }
                   
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        }
        
        

    }
    
}
