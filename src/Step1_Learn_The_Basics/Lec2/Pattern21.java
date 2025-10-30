package Step1_Learn_The_Basics.Lec2;

/*
        * * * *
        *     *
        *     *
        * * * *
 */

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        int n;
        if(args.length>0) n=Integer.parseInt(args[0]);
        else{
            Scanner sc= new Scanner(System.in);
            n=sc.nextInt();
        }

        for(int i=1; i<=n; i++){
            if(i==1 || i==n) for(int j=1; j<=n; j++) System.out.print("* ");
            else{
                for(int j=1; j<=n; j++){
                    if(j==1 || j==n) System.out.print("* ");
                    else System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
