package Step3_Problems_on_Arrays.Lec2_Medium;

import java.util.*;

public class LeetCode_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result= new ArrayList<>();
        int minrow=0;
        int maxrow=matrix.length-1;
        int mincolumn=0;
        int maxcolumn= matrix[0].length-1;
        int temp=0;
        int r=0;
        int c=0;
        result.add(matrix[0][0]);
        for(int i=0; i<(matrix.length * matrix[0].length)-1; i++){
            boolean checker= true;

            if(c!= maxcolumn && temp == 0){
                c++;
            }
            else if(temp==0){
                temp=1;
                minrow++;
            }


            if(r!= maxrow && temp==1){
                r++;
            }
            else if(temp==1){
                temp=2;
                maxcolumn--;
            }


            if(c!=mincolumn && temp==2){
                c--;
            }
            else if(temp==2){
                temp=3;
                maxrow--;
            }


            if(r!=minrow && temp==3){
                r--;
            }
            else if(temp==3){
                temp=0;
                mincolumn++;
                i--;
                checker= false;
            }

            if(checker){
                result.add(matrix[r][c]);
            }
        }
        return result;
    }
}
