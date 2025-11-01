package Step2_Important_Sorting_Techniques.Lec2;

public class Recursive_InsertionSort {
    public int[] insertionSort(int[] nums) {
        helper(nums, 1);
        return nums;
    }

    public void helper(int[] nums, int i){
        if(i>=nums.length) return;
        if(nums[i]>=nums[i-1]){
            helper(nums, i+1);
            return;
        }

        int j=0;
        while(nums[j]<nums[i]) j++;
        int temp=nums[i];
        for(int k=i; k>j; k--) nums[k]=nums[k-1];
        nums[j]=temp;

        helper(nums, i+1);
    }
}
