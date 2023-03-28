/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_.pkg1;

/**
 *
 * @author PC
 */
public class Linear_Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={2,9,4,72};
        int index = linearsearch(arr,9);
        System.out.println("index "+index);
        
    }
    public static int linearsearch(int arr[],int element)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element)
            {
                return i;//return isleminden sonra i ne olursa olsun for dongusu calısmasi durur yani linearsearch metodunun calismasiini durdurur
            }
        }
        return-1;
    }
    
}
