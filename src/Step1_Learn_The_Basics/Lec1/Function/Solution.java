package Step1_Learn_The_Basics.Lec1.Function;

public class Solution {
    int max_of_four(int a, int b, int c, int d){
        int max=a;
        if(max<b) max=b;
        if(max<c) max=c;
        if(max<d) max=d;
        return max;
    }
}
