/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mixed_exercises;

/**
 *
 * @author PC
 */
public class Quick_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[] = {7,2,5,9,0};
        partition(0,arr.length,arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
       
        
    }
    public static void partition(int start,int end,int arr[])
    {
       
       int pivot = -1;
       int n = end-start-1;

        for (int i = n ; i >= 0; i--) {
            if(pivot==i)
            {
                partition(start,(end-start)/2,arr) ;
                partition((end-start)/2,end-1,arr);
               
            }
            if(arr[i]>arr[start])
            {
                start++;
                pivot++;
                int tmp = arr[start];
                arr[start]=arr[i];
                arr[i]=tmp;

            }
            
        }

        
    }
    
}
