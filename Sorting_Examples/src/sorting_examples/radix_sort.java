
package sorting_examples;
import java.util.Scanner;
public class radix_sort {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int stop=0;
        int j = 0;
        int n = 0;
        int array[]=new int[255];
        do
        {
            System.out.println("Please enter a number");
            array[j]= input.nextInt();
            j++;
            System.out.println("wrtie for : stop-1 , continue-0");
            stop = input.nextInt();
        }   
        while(stop!=1);
        {
            stop=1;
        }
        int max = 0;
        find_n(array,max);
        int array_length=j;
        radixsort(array,max,array_length);
        for (int i = 0; i < array_length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void find_n(int array[],int max)
    {
        int counter = 0;
        for (int j = 0; j < array.length; j++)
        {
            for (int i = 0; i < 10; i++) 
            {
            int temp =  (int) ((int)array[i]/Math.pow(10,i));
            if(temp!=0)
            {
                counter++;
            }
            }
        }
        
        if(counter>max)
        {
            max = counter;
        }
    }
    public static int radixsort(int array[],int n,int array_length)
    {
        int length = array.length-1;
        int index[]=new int[array.length+1];
        int max = 0;
        int div = (int) Math.pow(10,n);
        if(n==-1)
        {
            return 0 ;
        }
        else
        for (int i = 0; i < array_length; i++)
        {
            for (int j = 0; j < array_length; j++) 
                if(array[i]/div >array[j]/div)
                {
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                    
                }
                
            }
        return radixsort(array,n-1,array_length);
    }
    

   
}
