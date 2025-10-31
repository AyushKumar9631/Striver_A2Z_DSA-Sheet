package Step1_Learn_The_Basics.Lec4;

public class GCD {
    public int GCD(int n1, int n2) {
        if(n1>n2) return helper(n1, n2);
        else return helper(n2, n1);
    }

    public int helper(int a, int b){
        if(b==0) return a;
        return helper(b, a%b);
    }
}
