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
public class Sorting_small_to_largest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int arr[]={9,7,4,2};
    int array[]={1,2,3,4};
    sort(arr);
    sort(array);
    }
    public static int[] sort(int arr[])
    {
        int j = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1])
            {
                j = 0;
            }
            else{
                j = 1;
            }
                
        }
        if(j==0)
        {
            System.out.println("This array sorted small to largest");
        }
        else
        {
            System.out.println("This array not sorted small to largest");
        }
        return arr;
    }
    
}
