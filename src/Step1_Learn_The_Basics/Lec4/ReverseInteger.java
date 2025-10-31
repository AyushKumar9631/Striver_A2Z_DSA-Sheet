package Step1_Learn_The_Basics.Lec4;

/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */

public class ReverseInteger {
    public int reverse(int x) {
        long n=x;
        boolean neg=false;
        if(n<0){
            n*=-1;
            neg=true;
        }
        StringBuilder s= new StringBuilder(Long.toString(n));
        s=s.reverse();
        n=Long.parseLong(s.toString());
        if(neg) n*=-1;
        x=(int)n;
        return(x==n)? x: 0;
    }
}
