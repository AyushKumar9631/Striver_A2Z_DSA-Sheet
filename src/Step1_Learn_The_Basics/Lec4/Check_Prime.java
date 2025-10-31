package Step1_Learn_The_Basics.Lec4;

public class Check_Prime {
    public boolean isPrime(int n) {
        int limit=(int)Math.sqrt(n);
        for(int i=2; i<=limit; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
