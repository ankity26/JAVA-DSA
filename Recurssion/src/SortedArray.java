public class SortedArray
{
    //to check if array is sorted or not using recursion
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,5,16,18};
        System.out.println(Sorted(nums , 0));

    }

    static boolean Sorted(int[] arr , int index){

        if(index == arr.length-1){  //Base Condition
            return true;
        }

        return arr[index] < arr[index+1] && Sorted(arr , index+1); //Recursion statement
    }
}
