/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_examples;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Cocktail_sort_and_efficient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int arr[]={7,5,1,3,2};
        cocktail_sort(arr);
        int[] array = cocktail_sort(arr);
        gen(array);
    }   
    public static int[] cocktail_sort(int arr[])
    {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1])
            {
                int tmp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=tmp;
            }
        }
        for (int i = arr.length-1 ; i >=1 ; i--) {
            if(arr[i-1]>arr[i])
            {
                int tmp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=tmp;
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Clock time :"+(finishTime-startTime));
        return arr;
    }
    public static int[] gen(int []array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+1+"'inci eleman "+array[i]+"'dir.");
        }
        return array;
    }
}
    