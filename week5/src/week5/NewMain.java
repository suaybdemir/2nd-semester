/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author PC
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dijital_saat ds = new dijital_saat(0,0,0);
        System.out.println(ds.hour+":"+ds.minutes+":"+ds.seconds);
        ds.ilerlet();
        System.out.println(ds.hour+":"+ds.minutes+":"+ds.seconds);
        int a = 0;
        saat(ds.hour,ds.minutes,ds.seconds);
        
    }
    public static int saat(int h,int m,int s)
    {
            s++;
        if(s==60)
        {
            s=0;
            m++;
            if(m==60)
            {
                m=0;
                h++;
                if(h==24)
                {
                    h=0;
                }
            }
        }
    
        System.out.println(h+":"+m+":"+s);
        return s;
        
    }
    


    
}
