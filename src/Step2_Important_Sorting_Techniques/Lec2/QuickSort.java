package Step2_Important_Sorting_Techniques.Lec2;

public class QuickSort {
    public int[] quickSort(int[] nums) {
        helper(nums, 0, nums.length-1);
        return nums;
    }

    public void helper(int[] nums, int l, int r){
        if(l>=r) return;

        int i=l;
        int pivot=nums[r];
        for(int j=l; j<r; j++){
            if(nums[j]<pivot){
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, r);

        helper(nums, l, i-1);
        helper(nums, i+1, r);
    }

    public void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
