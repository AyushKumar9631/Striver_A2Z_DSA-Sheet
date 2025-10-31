package Step1_Learn_The_Basics.Lec5;

public class ReverseArray {
    public void reverse(int[] arr, int n) {
        helper(arr,0, n-1);
    }

    public void helper (int[] arr, int s, int e){
        if(s>=e) return;
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        helper(arr, s+1, e-1);
    }

}
