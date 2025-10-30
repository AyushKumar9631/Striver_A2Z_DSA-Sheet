package Step1_Learn_The_Basics.Lec2;

/*
            *
          * * *
        * * * * *
      * * * * * * *
 */

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        int n;
        if(args.length>0) n=Integer.parseInt(args[0]);
        else{
            Scanner sc= new Scanner(System.in);
            n=sc.nextInt();
        }
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("* ");
            System.out.println();
        }
    }
}
