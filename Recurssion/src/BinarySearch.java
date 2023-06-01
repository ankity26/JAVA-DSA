public class BinarySearch
{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int target = 5;
        search(nums , target , 0 , nums.length-1);
    }

    static void search(int[] arr ,int target , int start , int end){
        if(start > end){
            return;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            System.out.println(mid);
        }
        if(arr[mid] > target){
            search(arr ,  target , start , mid -1);
        }
        else{
            search(arr , target , mid +1 , end);
        }
    }
}
