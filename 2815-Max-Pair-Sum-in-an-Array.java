class Solution {
    public int maxSum(int[] nums) {
        int max = -1;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                
                if (getMaxDigit(nums[i]) == getMaxDigit(nums[j])) {
                    int s = nums[i] + nums[j];
                    if (s > max) {
                        max = s;
                    }
                }
            }
        }
        
        return max;
    }
    
   
    private int getMaxDigit(int num) {
        int maxDigit = 0;
        while (num > 0) {
            maxDigit = Math.max(maxDigit, num % 10);
            num /= 10;
        }
        return maxDigit;
    }
}