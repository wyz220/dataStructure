class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length < 1 || nums.length % k == 0)return;
        
        int[] a = new int[nums.length];
        //(i+k)%数组长度(i+k)%数组长度 的位置
        for(int i=0;i<nums.length;i++){
            a[(i+k)%(nums.length)] = nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            nums[i] = a[i];
        }
    }
}