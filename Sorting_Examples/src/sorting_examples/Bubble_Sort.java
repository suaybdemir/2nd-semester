/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorting_examples;
import java.util.Random;

/**
 *
 * @author PC
 */
public class Bubble_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int arr[] = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(1000);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j =0 ; j < arr.length-i-1; j++) {
               if(arr[j]>=arr[j+1])
                {
                int tmp = arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=tmp; 
                } 
            }
            
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Clock time :"+(finishTime-startTime));
        
    }
    
}
