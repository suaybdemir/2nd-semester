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
public class dijital_saat {
    int hour, minutes,seconds;
    
    dijital_saat()
    {
        hour = 0; minutes = 0 ; seconds = 0;
    }
    dijital_saat(int h,int m,int s)
    {
        hour = h;minutes=m;seconds=s;
    }
    void ilerlet()
    {
        seconds++;
        if(seconds==60)
        {
            seconds=0;
            minutes++;
            if(minutes==60)
            {
                minutes=0;
                hour++;
                if(hour==24)
                {
                    hour = 0;
                }
            }
        }
    }
    
}
