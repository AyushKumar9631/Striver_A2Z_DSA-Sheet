package Step1_Learn_The_Basics.Lec5;

public class Print_1toN {
    public void printNumbers(int n) {
        if(n==0) return;
        printNumbers(n-1);
        System.out.println(n);
    }
}
