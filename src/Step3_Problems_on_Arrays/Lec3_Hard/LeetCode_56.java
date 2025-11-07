package Step3_Problems_on_Arrays.Lec3_Hard;

import java.util.*;

public class LeetCode_56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> (a[0]==b[0])? a[1]-b[1] : a[0]-b[0]);
        List<List<Integer>> result= new ArrayList<>();
        int n=intervals.length;
        int i=0;
        while(i<n){
            List<Integer> cur= new ArrayList<>();
            cur.add(intervals[i][0]);
            int end=intervals[i][1];
            i++;
            while(i<n && intervals[i][0]<=end){
                end=Math.max(intervals[i][1], end);
                i++;
            }
            cur.add(end);
            result.add(cur);
        }

        n=result.size();
        int[][] ans= new int[n][2];
        for(int j=0; j<n; j++){
            ans[j][0]=result.get(j).get(0);
            ans[j][1]=result.get(j).get(1);
        }
        return ans;
    }
}
