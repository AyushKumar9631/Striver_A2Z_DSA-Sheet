package Step3_Problems_on_Arrays.Lec2_Medium;

import java.util.ArrayList;

public class LeetCode_73 {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        boolean a= false;
        boolean b= false;
        for (int i = 0; i < matrix.length; i++) {
            b=false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    cols.add(j);
                    b = true;
                }
            }
            if(b){
                rows.add(i);
            }
        }
        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[rows.get(i)][j] = 0;
            }
        }
        for (int i = 0; i < cols.size(); i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][cols.get(i)] = 0;
            }
        }
    }
}
