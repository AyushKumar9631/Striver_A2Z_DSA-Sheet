package Step1_Learn_The_Basics.Lec2;

/*
        1
        0 1
        1 0 1
        0 1 0 1
 */

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int s=1;
        for(int i=1; i<=n;i++){
            int x=s;
            for(int j=0; j<i; j++){
                System.out.print(x+" ");
                x=(x+1)%2;
            }
            System.out.println();
            s=(s+1)%2;
        }
    }
}

