package Step1_Learn_The_Basics.Lec5;

public class Sum_Till_N {
    public int NnumbersSum(int n) {
        if(n==0) return 0;
        return n+NnumbersSum(n-1);
    }
}
