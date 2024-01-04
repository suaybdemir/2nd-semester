/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mixed_exercises;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Binarysearch {

    /**
     * @param args the command line arguments
     * 
     * 
     * 
     */
    public static void binary(int arr[],int n,int mid,int high)
    {
        
        if(arr[mid]<n)
        {
            mid = mid/2;
            mid--;
            high=mid;
            binary(arr,n,mid+1,high);
        }
        else if(arr[mid]>n)
        {
            mid = mid+ mid/2 ;
            mid++;
            binary(arr,n,mid-1,high);
        }
        else
        {
            System.out.println("index number is "+mid);
        }
      
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int arr[]={2,7,9,11,78,101,116,779};
        System.out.println("Whats your wanted number");
        int a = input.nextInt();
        int mid = arr.length/2;
        binary(arr,a,mid,arr.length-1);
    }
    
}
