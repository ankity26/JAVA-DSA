import java.util.Arrays;

public class First_and_Last_position
{
    public static void main(String[] args)
    {
        //We have given an arrays of integer we have to return the first and last index of the target.

        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr , target)));
        // so we make a function searchRange and we call it from here
    }

    static int[] searchRange(int[] nums, int target)
    {
        int[] res = new int[2]; // we create and array to store value of first and last
        res[0] = findStartIndex(nums ,target);
        res[1] = findEndIndex(nums , target);
        return res;

        /*
        we make two functions here one for the start index and other for the end index. And then we store there values.
        * */
    }

    static int findStartIndex(int[] nums , int target )
    {
        //first fucntion to find the start index.
        int index = -1; // if we don't find anything we will return this value as given in question
        int start = 0;  //
        int end = nums.length-1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            //simple binary search  we intialize the start point and end point then we take mid point.

            /*
            okay we will have an array of ascending order and numbers can be repetitive. {5,7,7,8,8,10};
            suppose we are at mid point == 2 if our current mid greater than equal to target we decrement end--
            else start++; and if we found our target we make our mid new index.

             */


            if(nums[mid] >= target)
            {
                end = mid-1;
            }
            else
            {
                start = mid +1;
            }

            if(nums[mid] == target)
            {
                index = mid;
            }


        }
        return index;

    }
    static int findEndIndex(int[] nums , int target )
    {
        int index = -1;
        int start = 0;
        int end  = nums.length-1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid] <= target)
            {
                start = mid +1;

            }
            else{
                end = mid - 1;
            }

            if(target == nums[mid])
            {
                index = mid;

            }


        }
        return index;

    }
}
