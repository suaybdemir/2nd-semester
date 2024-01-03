/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mixed_exercises;

/**
 *
 * @author PC
 */
public class Selection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={6,3,1,4,2,5};
       
        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<min)
                {
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i]=min;
            
        }
        System.out.println(arr);
    }
    
}
