import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,3,5,6};
        System.out.println("index = " + sol.searchInsertV1(nums, 5));
    }
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == target) return i;
            else if(nums[i] <= target && target <= nums[i+1]){
                return i+1;
            }
        }
        if(nums[0] >= target) return 0;
        return nums.length;
    }
    public int searchInsertV1(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return start;
    }
}
