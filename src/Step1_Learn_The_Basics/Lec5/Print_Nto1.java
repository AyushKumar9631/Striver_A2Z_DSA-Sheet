package Step1_Learn_The_Basics.Lec5;

public class Print_Nto1 {
    public void printNumbers(int n) {
        if(n==0) return;
        System.out.println(n);
        printNumbers(n-1);
    }
}
