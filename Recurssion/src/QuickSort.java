import java.util.Arrays;

public class QuickSort
{
    //we will be using four pointer in quick sort two of them were for partion and another two were for sorting
    public static void main(String[] args) {

        int[] arr = {4 ,5, 3, 2 ,1};
        quickSort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] nums , int low , int hi){

        if(low >= hi){
            return;
        }
        int start = low;
        int end = hi;
        int mid = start + (end - start)/2;
        int pivot = nums[mid];

        while(start <= end){
            while(nums[start] < pivot){
                start++;
            }
            while(nums[end] > pivot){
                end--;
            }

            if(start <= end){

                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(nums , low , end);
        quickSort(nums , start , hi);
    }
}
