package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {


        // for(int i = 0; i<nums.length; i++){

        //     for(int j = nums.length-1; j>i; j--){

        //         if(nums[i]+nums[j]==target){


        //            return new int []{i,j};
        //         }

        //     }
        // }
        // throw new IllegalArgumentException("No solution");

        int complement = 0;
        Map<Integer,Integer> res = new HashMap<>();
        for(int i = 0; i< nums.length; i++)
        {

            complement = target - nums[i];



            if (res.containsKey(complement)){

                return new int []{i,res.get(complement)};
            }
            res.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }

    void main(){

        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4}, 5)));
    }
}
