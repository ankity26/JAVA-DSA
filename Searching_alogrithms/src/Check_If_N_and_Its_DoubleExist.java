
import java.util.Arrays;
public class Check_If_N_and_Its_DoubleExist
{
    public static void main(String[] args)
    {
        int[] nums = {10,2,5,3};
        System.out.println(checkIfExist(nums));


    }
    static boolean checkIfExist(int[] arr)
    {

        Arrays.sort(arr); //we first sort the array in ascending order

        for(int i = 0; i < arr.length; i++)
        {
            int target = 2*arr[i];
            int start = 0;
            int end = arr.length-1;

            while(start <= end)
            {
                int mid = start + (end - start ) / 2;
                if(arr[mid] == target && mid != i) return true;

                else if (arr[mid] < target)
                    start ++;

                else
                    end--;
            }
        }
        return false;
    }
    /* we use a for loop and inside that a while loop.
       we take the first element and we multiply it by 2 and we make it our target
       and then we'll look for our target using the while loop.
        if we find the target and our above i and mid is not equal we return true.
     */
}


