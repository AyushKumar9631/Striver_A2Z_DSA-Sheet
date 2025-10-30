package Step1_Learn_The_Basics.Lec2;

/*
        *
        * *
        * * *
        * *
        *
 */

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Pattern2.main(new String[]{n+""});
        Pattern5.main(new String[]{n-1+""});

    }
}
