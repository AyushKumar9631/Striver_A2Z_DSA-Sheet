package Step1_Learn_The_Basics.Lec4;

import java.util.ArrayList;

public class Armstrong_No {
    public boolean isArmstrong(int n) {
        int N=n;
        ArrayList<Integer> digits= new ArrayList<>();
        while(n>0){
            digits.add(n%10);
            n=n/10;
        }

        int digit_count=digits.size();
        int sum=0;
        for(int digit : digits){
            sum+=(int)Math.pow(digit, digit_count);
        }
        return (sum==N);
    }
}
