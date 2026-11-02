class Solution {
    public int minMoves2(int[] nums) {
        int tm=0;
        Arrays.sort(nums);
         int m=nums[nums.length/2];
        for(int i=0;i<nums.length;i++){
              tm+=Math.abs(nums[i]-m);
        }
    return tm;
    }

}