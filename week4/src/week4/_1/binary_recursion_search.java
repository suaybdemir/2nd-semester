/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4._1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class binary_recursion_search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int index = binary_search(arr,0,arr.length,4);
        System.out.println(index);
    }
    public static int binary_search(int arr[],int low,int high,int n)
    {
        
        if(high>low)
        {
            int mid = (high+low)/2;
            if(arr[mid]==n)
            {
            return mid;
            }
            else if(arr[mid]>n)
            {
            return binary_search(arr,mid+1,high,n);

            }
            else if(arr[mid]<n)
            {
            return binary_search(arr,low,mid-1,n);
            }
        }
            
        return -1;
        
    }
    
}
