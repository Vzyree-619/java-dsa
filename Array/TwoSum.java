// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Examples

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Output: Because nums[0] + nums[1] == 9, we return [0, 1]


// Input: nums = [3,2,4], target = 6
// Output: [1,2]

package Array;
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
      for (int i = 0; i<nums.length; i++){
        for (int j = i + 1; j< nums.length; j++){
            if (nums[i] + nums[j] == target){
                return new int [] {i, j};
                
        }}


      }
      throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
      TwoSum twoSum = new TwoSum();
      int[] nums = {2,7,11,15};
      int target = 9;

      try {
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Indices of two numbers that add up to target: " + result[0]+ ","+ result[1]);

      }catch(IllegalArgumentException e){
        System.out.println(e.getMessage());

      }

    }

}
