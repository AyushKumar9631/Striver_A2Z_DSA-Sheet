package Step2_Important_Sorting_Techniques.Lec2;

public class Recursive_BubbleSort {
    public int[] bubbleSort(int[] nums) {
        helper(nums, nums.length-1);
        return nums;
    }

    public void helper(int[] nums, int i){
        boolean swapped=false;
        for(int j=0; j<i; j++){
            if(nums[j]>nums[j+1]){
                swap(j, j+1, nums);
                swapped=true;
            }
        }
        if(!swapped) return;
        helper(nums, i-1);
    }

    public void swap(int i, int j, int[]arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
