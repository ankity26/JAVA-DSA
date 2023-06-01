import java.util.Arrays;

public class MergeSort {

    public static final int i = 0;

    public static void main(String[] args) {

        int[] arr = {5 ,4 ,3 ,2 ,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] nums){

        if(nums.length == 1){
            return nums;
        }
        int mid = nums.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0 , mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid , nums.length));

        return merge(left , right);
    }

    static  int[] merge(int[] first , int[] second){

        int i = 0;
        int j = 0;
        int k = 0;
        int[] mix =  new int[first.length + second.length];
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of the array is greater than other array and is not complete
        //to copy the remaining elements

        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < first.length){
            mix[k] = first[j];
            j++;
            k++;
        }

        return mix;

    }
}
