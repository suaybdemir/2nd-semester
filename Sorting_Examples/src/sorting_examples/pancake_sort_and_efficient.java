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
public class pancake_sort_and_efficient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long startTime = System.currentTimeMillis();
        Random r = new Random();
        int arr[]=new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i]=r.nextInt(10000);
        }
        sort(arr,arr.length);
        long finishTime = System.currentTimeMillis();
        System.out.println("Clock time :"+(finishTime-startTime));
    } 
    public static int sort(int arr[],int length)
    {
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
                index = i;
            }
        }
        int tmp=arr[0];
        arr[0]=max;
        arr[index]=tmp;
        int low = 0;
        int high=length-1;
        for (int i = 0; i < length; i++)
        {
            if(high>low)
            {
                    int tmp_1 = arr[low];
                    arr[low]=arr[high];
                    arr[high]=tmp_1;
                    high--;
                    low++;
            }
           
                    
        }
        length--;
        if(length>2)
        {
           return sort(arr,length);
        }
        return 0;
    }
    
    
}
