package Step1_Learn_The_Basics.Lec2;

/*
        A B C D
        A B C
        A B
        A
 */

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        char x='A';
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(x++ +" ");
            }
            System.out.println();
            x='A';
        }
    }
}