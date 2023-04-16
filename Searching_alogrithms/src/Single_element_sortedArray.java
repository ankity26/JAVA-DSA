public class Single_element_sortedArray {
    //https://leetcode.com/problems/single-element-in-a-sorted-array/
    /*
    In this problem we
    */
    public static void main(String[] args)
    {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int answer = singleElement(nums);
        System.out.println(answer);

    }

    static int singleElement(int[] nums)
    {
        int start = 0;
        int end = nums.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(mid % 2 == 1){  //to check if current element is odd or not
                mid--;
            }

            if(nums[mid] != nums[mid+1])  // to check if current number is in pair or not
            {
                end = mid;
            }
            else {  // if nums mid is equal to nums to the right side.
                start = mid+2;
            }
        }

        return nums[end];   // we can also use start coz both will be pointing to the same element.

    }
}
