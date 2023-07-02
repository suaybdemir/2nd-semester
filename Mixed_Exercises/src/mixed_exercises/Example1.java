/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mixed_exercises;

/**
 *
 * @author PC
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double N = 7.125;
        double c = 1 ;
        double multiplication = 1;
        while(N<=multiplication)
        {
            c = c*10;
            multiplication = multiplication * c * N ;
           
        }
                System.out.println(multiplication);
                System.out.println(c);
        
    }
    
}
