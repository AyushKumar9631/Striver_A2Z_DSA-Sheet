package Step3_Problems_on_Arrays.Lec1_Easy;

public class LeetCode_1752 {
    public boolean check(int[] nums) {
        int n=nums.length;
        int s=-1;
        for(int i=1; i<n; i++){
            if(nums[i]<nums[i-1]){
                s=i;
                break;
            }
        }

        if(s==-1) return true;
        if(nums[n-1]>nums[0]) return false;
        for(int i=s+1; i<n; i++){
            if(nums[i]<nums[i-1]) return false;
        }
        return true;
    }
}
