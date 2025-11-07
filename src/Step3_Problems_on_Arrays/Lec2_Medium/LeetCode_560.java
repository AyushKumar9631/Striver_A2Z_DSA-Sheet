package Step3_Problems_on_Arrays.Lec2_Medium;

import java.util.HashMap;

public class LeetCode_560 {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        HashMap<Integer, Integer> prefix= new HashMap<>();
        prefix.put(0,1);
        int Tsum=0;
        for(int i=0; i<nums.length; i++){
            Tsum+=nums[i];
            int p=Tsum-k;
            if(prefix.containsKey(p)) count+=prefix.get(p);
            prefix.put(Tsum, prefix.getOrDefault(Tsum, 0)+1);
        }
        return count;
    }
}
