/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mixed_exercises;

import java.util.*;

/**
 *
 * @author PC
 */
public class Insertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {64,123,56,13,45,76};
         Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < arr.length; i++) {
            
             int array[]=new int[5];
            int j;
            if(arr[i]<arr[i-1])
            {
            
            int temp = arr[i];
            
            for ( j = i; j >0 && arr[j-1]>temp; j--) {
                
                stack.push(arr[j-1]);
               
                array[i-1]=j;
                //arr[j]=arr[j-1];
                
            }
            arr[j]=temp;
            }
            for (int k = 0; k < arr.length; k++) {
                array[k]=
            }
            
        }
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]);
        }
    }
    
}
