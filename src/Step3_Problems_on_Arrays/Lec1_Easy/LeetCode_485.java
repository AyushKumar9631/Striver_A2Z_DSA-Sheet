package Step3_Problems_on_Arrays.Lec1_Easy;

public class LeetCode_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int n=nums.length;
        int result=0;
        while(i<n){
            if(nums[i]==1){
                int count=0;
                while(i<n && nums[i]==1){
                    i++;
                    count++;
                }
                result=Math.max(result,count);
            }
            else{
                while(i<n && nums[i]==0) i++;
            }
        }
        return result;
    }
}
