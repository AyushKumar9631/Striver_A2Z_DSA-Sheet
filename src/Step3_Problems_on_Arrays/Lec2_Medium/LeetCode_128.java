package Step3_Problems_on_Arrays.Lec2_Medium;

import java.util.Arrays;

public class LeetCode_128 {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        int cur=0;
        for(int i=0; i<nums.length; i++){
            if(cur==0){
                cur++;
            }
            else if(nums[i]-nums[i-1]==1) cur++;
            else if(nums[i]-nums[i-1]!=0){
                result=Math.max(result, cur);
                cur=1;
            }
        }
        return Math.max(result, cur);
    }
}
