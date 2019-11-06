// https://leetcode-cn.com/classic/problems/remove-duplicates-from-sorted-array/description/
public int removeDuplicates(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                nums[i-1] = -1;
            }
        }
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != -1){
                 nums[count++] = nums[i];
            }
        }
        return count;
    }
	
	