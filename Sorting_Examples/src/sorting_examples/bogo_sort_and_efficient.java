
package sorting_examples;

import java.util.Scanner;
import java.util.Random;

public class bogo_sort_and_efficient {

    public static void main(String[] args) {
        // TODO code application logic here
        long startTime = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int arr[]=new int[1000];
        
        long finishTime = System.currentTimeMillis();
        System.out.println("Clock time :"+(finishTime-startTime));
    }
    public static  int[] bogosort(int arr[],int sum)
    {
        
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(1000);
        }
        for (int i = 0; i < arr.length-1; i++)
        {
            if(arr[i+1]>arr[i])
            {
                    sum++;
            }
        }
        if(sum==arr.length-1)
        {
            return null;
        }
        sum=0;
        
        return bogosort(arr,sum);
    }
   
}
