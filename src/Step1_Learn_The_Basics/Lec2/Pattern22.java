package Step1_Learn_The_Basics.Lec2;

/*
        3 3 3 3 3
        3 2 2 2 3
        3 2 1 2 3
        3 2 2 2 3
        3 3 3 3 3
 */

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=n; i>=1; i--){
            for(int j=n; j>=1; j--){
                System.out.print(Math.max(j,i)+" ");
            }
            for(int j=2; j<=n; j++){
                System.out.print(Math.max(j,i)+" ");
            }
            System.out.println();
        }

        for(int i=2; i<=n; i++){
            for(int j=n; j>=1; j--){
                System.out.print(Math.max(j,i)+" ");
            }
            for(int j=2; j<=n; j++){
                System.out.print(Math.max(j,i)+" ");
            }
            System.out.println();
        }
    }
}
