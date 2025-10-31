package Step1_Learn_The_Basics.Lec5;

import java.util.HashMap;

public class LeetCode_509 {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(map.containsKey(n)) return map.get(n);
        int a=fib(n-1);
        int b= fib(n-2);
        map.put(n,a+b);
        return a+b;
    }
}
