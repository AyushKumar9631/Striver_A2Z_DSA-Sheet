package Step1_Learn_The_Basics.Lec4;

/*
Given an integer x, return true if x is a palindrome, and false otherwise
 */

public class Palindrome {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        char[] digits=str.toCharArray();
        int s=0;
        int e=digits.length-1;
        while(s<e){
            if(digits[s]!=digits[e]) return false;
            s++;
            e--;
        }
        return true;
    }
}
