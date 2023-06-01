package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTwo {
    public static void main(String[] args) {

        int[] candidates = {10,1,2,7,6,1,5};
        int Target = 8;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        sum(candidates , Target , 0 , res , new ArrayList<>());
        System.out.println(res);

    }
    static void sum(int[] arr , int target , int index ,List<List<Integer>> res , List<Integer> ds){
        if(target == 0){
//          This will be our Base Condition.
            res.add(new ArrayList<>(ds));
            return;
        }

//        Our main recursive function
        for(int i = index; i < arr.length; i++){
            if(i > index && arr[i] == arr[i-1]) continue;

            if(arr[i] > target) break;

            ds.add(arr[i]);
            sum(arr , target-arr[i] , i+1 , res , ds);
//            if we want duplicates then we simply need to replace i by index.
//            when we will return back from loop we will remove last added element from the arraylist
            ds.remove(ds.size()-1);
        }



    }

}



// ! candidates = {10,1,2,7,6,1,5} Target = 8;
// * NO duplicates subsets allowed
// * we will add element to the list only if element is < target.
//! candidates[i] < target
/*!
// * [
// *[1,1,6],
// *[1,2,5],
// *[1,7],
// *[2,6]
// ]
!*/


