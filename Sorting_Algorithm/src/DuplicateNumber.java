public class DuplicateNumber
{
    //https://leetcode.com/problems/find-the-duplicate-number/
    //This is same as leetcode 268 question what's change is we our arrays contains number from [1,n] and duplicates
    //soo correct index of our element will always be 1 less than it's value for ex 1 has index of 0 and 5 will have index of 4.
    public static void main(String[] args)
    {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {

        int i = 0;
        int n = nums.length;

        while(i < nums.length)
        {

            if(nums[i] != i+1) //this checks if our element is at it's current index our not if it's not means our condtion is true and we run the loop.
            {
                int correct = nums[i]-1;
                if(nums[i] != nums[correct])
                {
                    swap(nums , i , correct);
                }
                else
                    return nums[i];

            }
            else i++;

        }

        return -1;



    }

    static void swap(int[] arr , int first , int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
