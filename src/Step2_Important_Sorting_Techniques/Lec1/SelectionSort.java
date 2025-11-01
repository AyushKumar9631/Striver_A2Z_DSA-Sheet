package Step2_Important_Sorting_Techniques.Lec1;

public class SelectionSort {
    public int[] selectionSort(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n-1){
            int min=i;
            for(int j=i+1; j<n; j++){
                if(nums[j]<nums[min]) min=j;
            }
            if(min!=i){
                int temp=nums[min];
                nums[min]=nums[i];
                nums[i]=temp;
            }
            i++;
        }
        return nums;
    }
}
