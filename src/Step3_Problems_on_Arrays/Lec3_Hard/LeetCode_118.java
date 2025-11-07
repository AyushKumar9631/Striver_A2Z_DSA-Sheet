package Step3_Problems_on_Arrays.Lec3_Hard;

import java.util.*;

public class LeetCode_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> prev= new ArrayList<>();
        prev.add(1);
        result.add(prev);
        while(numRows>1){
            List<Integer> cur= new ArrayList<>();
            cur.add(prev.get(0));
            for(int i=1; i<prev.size(); i++){
                cur.add(prev.get(i-1)+prev.get(i));
            }
            cur.add(prev.get(prev.size()-1));
            result.add(cur);
            prev=cur;
            numRows--;
        }
        return result;
    }
}
