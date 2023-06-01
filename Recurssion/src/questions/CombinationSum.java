package questions;
import java.util.*;
import java.util.ArrayList;

public class CombinationSum {

    public static void main(String[] args) {

        List<List<Integer>> ans = new ArrayList<>();
        int[] nums = {2,3,5};
        int target = 8;
        find(0 , nums , target , ans , new ArrayList<>());
        System.out.println(ans);


    }

//    We will use void in this function because we are not returning arraylist we are just changing existing arraylist of list.
    static void find(int index , int[] arr , int target , List<List<Integer>> ans , List<Integer> ds){
       if(index == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

//        if current element is less than target element we will pick the element
        if(arr[index] <= target){
            ds.add(arr[index]);
            find(index , arr , target-arr[index] , ans , ds); //pick it  first index
            ds.remove(ds.size()-1); //removing the last added element;
        }
        find(index+1 , arr , target, ans , ds); //not pick it the first index


    }
}
