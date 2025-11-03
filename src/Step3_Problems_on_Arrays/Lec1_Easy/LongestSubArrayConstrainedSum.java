package Step3_Problems_on_Arrays.Lec1_Easy;

public class LongestSubArrayConstrainedSum {
    public int longestSubarray(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int r=0;
        int sum=0;
        int result=0;
        while(r<n){
            if(sum==k) result=Math.max(result, r-l);
            if(sum>k){
                sum-=nums[l];
                l++;
                if(r<l) r=l;
            }
            else{
                sum+=nums[r];
                r++;
            }
        }
        if(sum==k) result=Math.max(result, r-l);
        return result;
    }
}
