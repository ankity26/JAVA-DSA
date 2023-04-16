public class Search_in_Rotated_Sorted_Array
{
    //https://leetcode.com/problems/search-in-rotated-sorted-array/

    /*
     so we have an array which is rotated by some unknow value like this {1 , 2 , 3 , 4 , 5 , 6 , 7} --> 4,5,6,7,0,1,2
     our approach will be to check if our element lies in right hand side of the aaray of left hand side of the array
     soo first we will check if our left hand side or array is sorted or not
                if it is sorted we will check if our element exist in left hand side or not
                    --to check this we need to check if our target is less = than the middle element and greater= than the starting element
                        if it is we will search on the left hand side by making our end boundary mid - 1;

                     --else , our element doesn't exist on left hand side we will look to the right hand side by making boundary start = mid+1;
         --> if our target is greater than current middle element and less than end element we will make mid+1 our new start  becoz we are not in right hand sorted array
         if we are in sorted array we just decrement the end value and when start and end will point to same element we wil find our target value.



    */
    public static void main(String[] args)
    {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int answer = indexofTarget(nums ,  target);

    }

    static int indexofTarget(int[] nums , int target)
    {
        int start = 0;
        int end = nums.length- 1;
        while(start <= end)
        {
            int mid = start + (end - start)/ 2 ;
            if(nums[mid] == target) return mid;

            //to check if left side is sorted or not
            if(nums[start] <= nums[mid])
            {
                //to check if our target in left side of the array
                if(target <= nums[mid] && target >= nums[start])
                {
                    end = mid - 1;
                }

                else
                {
                    start = mid +1;
                }
            }

            // right half sorted
            else{

                if(target >= nums[mid] && target <= nums[end])
                {
                    start = mid+1;
                }
                else end = mid - 1;

            }

        }

        return -1;



    }
}
