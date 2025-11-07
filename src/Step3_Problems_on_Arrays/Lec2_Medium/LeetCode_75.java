package Step3_Problems_on_Arrays.Lec2_Medium;

public class LeetCode_75 {
    public void sortColors(int[] nums) {
        int[] count=new int[3];
        for(int i: nums) count[i]++;
        int k=0;
        for(int i=0; i<3; i++){
            while(count[i]>0){
                nums[k]=i;
                k++;
                count[i]--;
            }
        }
    }
}
