/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_examples;

import java.util.Random;



/**
 *
 * @author PC
 */
public class Stooge_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  
    {
        // TODO code application logic here
        long startTime = System.currentTimeMillis();
        Random r = new Random();
        int array[]=new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i]=r.nextInt(1000);
        }
        
        stoogesort(array,0,array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
       long finishTime = System.currentTimeMillis();
       System.out.println("Clock time :"+(finishTime-startTime));
    }
    public static void stoogesort(int array[],int low,int high)
    {
        if(low>high)
        {
            return;
        }
        if(array[low]>array[high-1])
        {
            exchange(array,low,high-1);
        }
        if(high-low+1>2)
        {
            int t = (high-low+1)/3;
            stoogesort(array,low,high-t);
            stoogesort(array,low+t,high);
            stoogesort(array,low,high-t);
        }
    }
    public static void exchange(int array[],int a,int b)
    {
        if(array[a]>array[b])
        {
            int temp = array[a];
            array[a]=array[b];
            array[b]=temp;
        }
    }
    
}
