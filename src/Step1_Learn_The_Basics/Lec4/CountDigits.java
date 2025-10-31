package Step1_Learn_The_Basics.Lec4;

/*
You are given an integer n. You need to return the number of digits in the number.
The number will have no leading zeroes, except when the number is 0 itself.
 */

public class CountDigits {
    public int countDigit(int n) {
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
}
