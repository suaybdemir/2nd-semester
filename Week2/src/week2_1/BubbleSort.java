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
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={5,6,2,3,1};
        
        bubblesort(arr);
        
        
    }
    public static int[] bubblesort(int arr[])
    {
        for (int j = 0; j < arr.length-1; j++) {
            
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1])
            {
                int tmp = arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=tmp;
            }
        }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
       return arr;
    }
   
    
}
