package Step1_Learn_The_Basics.Lec4;

import java.util.ArrayList;
import java.util.Arrays;

public class Divisors {
    public int[] divisors(int n) {
        ArrayList<Integer> left= new ArrayList<>();
        ArrayList<Integer> right= new ArrayList<>();
        int limit=(int)Math.sqrt(n);
        for(int i=1; i<=limit; i++){
            if(n%i==0){
                int j=n/i;
                left.add(i);
                if(i!=j) right.add(0,j);
            }
        }

        int[] divisors= new int[left.size()+right.size()];
        int i=0;
        for(int ele: left){
            divisors[i]=ele;
            i++;
        }
        for(int ele:right){
            divisors[i]=ele;
            i++;
        }
        return divisors;
    }
}
