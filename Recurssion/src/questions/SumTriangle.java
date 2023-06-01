package questions;

import java.util.Arrays;
//https://www.geeksforgeeks.org/sum-triangle-from-array/

public class SumTriangle {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        SumOfTri(arr);
        //System.out.println(Arrays.toString(arr));
    }

    static void SumOfTri(int[] nums){

        if(nums.length < 1){ //Base condition
            return;
        }

        int n = nums.length-1; //new creating new array of size less than previous array
        int[] arr= new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = nums[i] + nums[i+1]; //filling the new array by consecutive sum of previous elements
        }
        SumOfTri(arr); //recursive call again with the new created array
        System.out.println(Arrays.toString(nums));
//        when it will hit the base case it will return and our print will start

    }
}
