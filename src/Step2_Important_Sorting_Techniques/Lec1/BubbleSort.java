package Step2_Important_Sorting_Techniques.Lec1;

public class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        int i=nums.length-1;
        while(i>0){
            boolean swapped=false;
            for(int j=0; j<i; j++){
                if(nums[j]>nums[j+1]){
                    swap(j, j+1, nums);
                    swapped=true;
                }
            }
            i--;
            if(!swapped) return nums;
        }
        return nums;
    }

    public void swap(int i, int j, int[]arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
