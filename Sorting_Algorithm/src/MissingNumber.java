public class MissingNumber
{
    //https://leetcode.com/problems/missing-number/

    public static void main(String[] args) {

        int[] nums = {3,0,1};
        int answer = missingNumber(nums); //function to find missing number!
        System.out.println(answer);


    }
        static int missingNumber(int[] nums) {
            int start_index = 0;  //So our starting point will be at index 0
            while(start_index < nums.length) //this loop will run till our startindex is close to nums length
            {
                //we need to find correct index of current element so we make a variable current and since our array starts will zero
                //index of current element will be equal to it's index since this is given in question that our array starts from [0,n]
                int correct = nums[start_index];
                if( nums[start_index] < nums.length && nums[correct] != nums[start_index])  //here we check if element at our start index !=
                    // element at it's correct index if that true we swap the elements
                    //this also ignores number which is greater than nums.length bcox of array size
                {
                    swap(nums,start_index,correct);
                }
                else start_index++;

            }

            for(int i = 0; i < nums.length; i++){ //this checks which number is missing if number is not it's place it return it's index.
                if(nums[i] != i) return i;
            }

            return nums.length;
        }

        static void swap(int[] arr , int first , int second)
        {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

}
