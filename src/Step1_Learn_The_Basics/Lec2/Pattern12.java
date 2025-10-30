package Step1_Learn_The_Basics.Lec2;

/*
        1       1
        1 2   2 1
        1 2 3 2 1
 */

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<=i) System.out.print(j+" ");
                else System.out.print("  ");
            }
            for(int j=n; j>0; j--){
                if(j<=i) System.out.print(j+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
