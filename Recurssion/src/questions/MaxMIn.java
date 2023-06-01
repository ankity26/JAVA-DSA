package questions;

public class MaxMIn {
    public static void main(String[] args) {

        int[] nums = {1, 4, 45, 6, 10, -8};
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        MinAndMax(nums , min , max , nums.length);

    }

    static void MinAndMax(int[] arr , int max , int min , int count){

        if(count < 1){
            System.out.println("Max : " + max);
            System.out.println("Min : " + min);
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        MinAndMax(arr , max , min , count-1);



    }
}
