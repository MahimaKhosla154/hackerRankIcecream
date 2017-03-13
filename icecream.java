import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class icecream {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int no_of_trips = scanner.nextInt();
        while(no_of_trips>0) {
            int temp1=0,temp2=0;
            int money = scanner.nextInt();
            int no_of_icecream = scanner.nextInt();
            int[] cost = new int[no_of_icecream];
            HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>(no_of_icecream);
            int i = 0;
            for(i=0;i<no_of_icecream;i++) {
                cost[i] = scanner.nextInt();
                hm.put(cost[i],i+1);
            }
            for(i=0;i<no_of_icecream;i++) {
                if(hm.containsKey(money-cost[i]) && i+1!=hm.get(money-cost[i])) {
                    temp1 = i+1;
                    temp2 = hm.get(money-cost[i]);
                    break;
                }
            }
            if(temp1<temp2)
                System.out.print(temp1+" "+temp2);
            else System.out.print(temp2+" "+temp1);
            System.out.println(" ");
        }
        
    }
}
