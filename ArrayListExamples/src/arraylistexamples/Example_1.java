package arraylistexamples;
import java.util.ArrayList;
import java.util.Scanner;
public class Example_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a integer ");
            int element = input.nextInt();
            list.add(element);
        }
        System.out.println(list);
    }
    
}
