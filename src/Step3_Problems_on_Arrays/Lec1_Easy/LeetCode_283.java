package Step3_Problems_on_Arrays.Lec1_Easy;

public class LeetCode_283 {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int p=0;
        while(p<n && nums[p]!=0) p++;

        if(p==n) return;

        for(int i=p+1; i<n; i++){
            if(nums[i]!=0){
                swap(nums, i, p++);
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
