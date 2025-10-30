package Step1_Learn_The_Basics.Lec2;

/*
            A
          A B A
        A B C B A
 */

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        int n;
        if(args.length>0) n=Integer.parseInt(args[0]);
        else{
            Scanner sc= new Scanner(System.in);
            n=sc.nextInt();
        }
        char x='A';
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print("  ");
            for(int j=1; j<=i; j++) System.out.print(x++ +" ");
            x--;
            for(int j=i-1; j>0; j--) System.out.print(--x +" ");
            System.out.println();
            x='A';
        }
    }}
