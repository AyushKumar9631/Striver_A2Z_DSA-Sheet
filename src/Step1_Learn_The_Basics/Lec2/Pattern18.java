package Step1_Learn_The_Basics.Lec2;
/*
        D
        C D
        B C D
        A B C D
 */


import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        int n;
        if(args.length>0) n=Integer.parseInt(args[0]);
        else{
            Scanner sc= new Scanner(System.in);
            n=sc.nextInt();
        }
        char x='A';

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(x+n-1-i+j ) +" ");
            }
            System.out.println();
        }
    }
}
