/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_1;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author PC
 */
public class Week2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        long startTime = System.currentTimeMillis();
        Random r = new Random(100);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("That took: " + (finishTime - startTime) + " ms");
    }
    public static int[][] randomarray(int N ,int ub){
        int a[][]=new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j]=(int)(Math.random()*ub);
            }
        }
        return a;
    }
    
}
