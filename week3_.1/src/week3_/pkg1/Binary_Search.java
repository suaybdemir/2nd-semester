/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_.pkg1;

/**
 *
 * @author PC
 */
public class Binary_Search {

    
    public static void main(String[] args) {
        int arr[]={7,3,8,4,2};
        int index = binary(arr,8);
        System.out.println("index "+index);
    }
    
    public static int binary(int arr[],int n)
    {
        int low = 0;int high = arr.length-1;
        int mid = low + ((high-low)/2);
        
        
        if(arr[mid]==n)
            {
                return mid;
            }
        else if(arr[mid]>n)
        {
                low = mid +1 ;
        }
        else if(arr[mid]<n)
            {
                high = mid - 1;
            }
        return-1;
        
    }
    
    
}
