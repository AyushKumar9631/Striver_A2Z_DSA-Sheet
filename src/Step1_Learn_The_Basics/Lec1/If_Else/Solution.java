package Step1_Learn_The_Basics.Lec1.If_Else;

/*
Given marks of a student, print on the screen:

Grade A if marks >= 90
Grade B if marks >= 70
Grade C if marks >= 50
Grade D if marks >= 35
Fail, otherwise.
*/

class Solution {
    public void studentGrade(int marks) {
        if(marks>=90) System.out.println("Grade A");
        else if(marks>=70) System.out.println("Grade B");
        else if(marks>=50) System.out.println("Grade C");
        else if(marks>=35) System.out.println("Grade D");
        else System.out.println("Fail");

    }
}
