package LeetCode.Array;
//1480. Running Sum of 1d Array
public class RunningSumo1dArray {
    public static int[] runningSum (int[] nums) {
        int[] result = new int[nums.length];
        result[0]= nums[0];
        for (int i = 1; i <nums.length ; i++) {
            result[i] = result[i-1]+nums[i];
           }

        return result;
    }

    public static void main (String[] args) {
        int[] nums = {1,2,3,4};


        int[] result2= runningSum(nums);
        for (int i = 0; i < result2.length ; i++) {
            System.out.println(result2[i]);
            
        }



    }
}
