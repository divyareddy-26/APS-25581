class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i=0; i<nums.length; i++) nums[i] = nums[i]*nums[i];
        int left=0;
        int right=nums.length-1;
        int result[] = new int[nums.length];
        int k = result.length-1;
        while(left<=right){
            if(nums[left]>nums[right]){
                result[k]=nums[left];
                k--;
                left++;
            }
            else{
                result[k]=nums[right];
                k--;
                right--;
            }
        }
        return result;
    }
}