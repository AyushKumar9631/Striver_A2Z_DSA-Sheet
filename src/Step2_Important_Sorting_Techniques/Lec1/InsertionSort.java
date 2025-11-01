package Step2_Important_Sorting_Techniques.Lec1;

public class InsertionSort {
    public int[] insertionSort(int[] nums) {
        for(int i=1; i<nums.length; i++){
            if(nums[i]>=nums[i-1]) continue;

            int j=0;
            while(nums[j]<nums[i]) j++;

            int temp=nums[i];
            for(int k=i; k>j; k--) nums[k]=nums[k-1];
            nums[j]=temp;
        }
        return nums;
    }
}
