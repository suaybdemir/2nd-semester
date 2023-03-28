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
public class CombSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[] ={1,5,3,4,6};
        int n = 4;
        combsort(arr,n);
        
    }
    public static void combsort(int arr[],int n)
    {
        int degisim = 1 , g , i , gap=n ;
        while ( (gap !=1 ) || (degisim==1) )
        {
            gap = (int) (gap/1.3) ;
            if(gap<1) 
            {
                gap = 1;
                degisim = 0;
            }
        }
        for (int j = 0; n-gap > j; j++) {
            if(arr[j]>arr[j+gap])
            {
                g = arr[j];
                arr[j]=arr[j+gap];
                arr[j+gap]=g;
                degisim=1;
            }
        }
        print(arr);
    }
    public static void print(int arr[])
    {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
    
}
