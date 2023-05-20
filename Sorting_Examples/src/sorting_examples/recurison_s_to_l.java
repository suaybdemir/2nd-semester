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
public class recurison_s_to_l {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={1,2,3,4};
        int a =sort(arr,arr.length-1);
        if(a==2)
        {
            System.out.println("This array sorted");
        }
        else
            System.out.println("This array not sorted");
        
    }
    public static int sort(int arr[],int i)
    {
        int sum;
        if(arr[i]>arr[i-1] && i>1)//decomposition
        {
            sum = sort(arr,i-1)+1;//composition
        }
        else//base case
            sum = 0;
            return sum;
    }
    
}
