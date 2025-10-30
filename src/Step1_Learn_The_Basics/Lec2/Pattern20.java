package Step1_Learn_The_Basics.Lec2;

/*
        *    *
        **  **
        ******
        **  **
        *    *
 */

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        int n;
        if(args.length>0) n=Integer.parseInt(args[0]);
        else{
            Scanner sc= new Scanner(System.in);
            n=sc.nextInt();
        }

        for(int i=n; i>=0; i--){
            for(int j=n+1; j>0; j--){
                if(j>i) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j=1; j<=n+1; j++){
                if(j>i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=1; i<=n; i++){
            for(int j=n+1; j>0; j--){
                if(j>i) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j=1; j<=n+1; j++){
                if(j>i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
