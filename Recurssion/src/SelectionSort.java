import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args) {



        int[] arr = {4,3,2,1};
        Selection(arr , arr.length, 0 , 0);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] nums , int end , int start , int max){

        if(end == 0){
            return;
        }

        if(start < end){

            if(nums[start] > nums[max]){
                Selection(nums , end , start+1, start);
            }
            else{
                Selection(nums , end , start+1, max);
            }
        }

        else{
            int temp = nums[max];
            nums[max] = nums[end-1];
            nums[end-1] = temp;
            Selection(nums , end-1, 0 , 0);
        }
    }
}
