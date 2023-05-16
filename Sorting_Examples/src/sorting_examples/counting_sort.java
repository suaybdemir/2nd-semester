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
public class counting_sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[]={7,3,6,3,5,4};
        int index[]=new int[10];
        int output[]=new int[array.length];
        countingsort(array,index,output);
        for (int i = 0; i < array.length; i++) {
            System.out.print(output[i]+"\n");
        }
    }
    public static void countingsort(int array[],int index[],int output[])
    {
        
        for (int i = 0; i < array.length; i++) {
              for (int j = 0; j < index.length; j++) {
                if(j==array[i])
                {
                    index[j]+=1;
                }
            }
        }
        for (int i = 0; i < index.length-1; i++) {
            index[i+1]+=index[i];
        }
        for (int j = 0; j < array.length; j++) {
                int tmp=array[j];
                int dimension=index[tmp];
                output[dimension-1]=tmp;
                index[tmp]--;
        }
        }
        
    }
    

