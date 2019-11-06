class Solution {
    public int removeDuplicates(int[] nums) {
        // 从 下标1开始，删除替换
        if(nums.length >= 2){
            int count = 1;
            for(int i=1;i<nums.length;i++){
                if(nums[i] != nums[i-1]){
                    nums[count++] = nums[i];
                }
            }
            return count ;
        }
        
        return nums.length;
        
    }
}