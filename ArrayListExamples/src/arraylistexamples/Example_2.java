/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexamples;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
/**
 *
 * @author PC
 */
public class Example_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(9);
        //list.remove(1);
        list.add(7, 5);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);
    }
    
}
