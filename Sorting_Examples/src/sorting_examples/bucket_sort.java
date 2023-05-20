/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_examples;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author PC
 */
public class bucket_sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int length = 3;
        double array[]=new double[length+1];
        int max = 1;
        int min = 0;
        for (int i = 0; i < length+1; i++)
        {
            array[i]= Math.random()*(max-min+1)+min;
        }
        ArrayList<Double> list = new ArrayList<Double>();
        for (int i = 0; i < length+1; i++)
        {
            for (int j = 0; j < length+1; j++) 
            {
                int bottom = i/length;
                int top = (i+1)/length;
                if(array[j]>=bottom && array[j]<=top)
                {
                    double temp =array[j];
                    list.add(i-2,temp);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
    
}
