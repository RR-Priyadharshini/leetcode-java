class Solution {
    public long maxAlternatingSum(int[] nums) {
        long r=0;
        long[] ar=new long[nums.length];
        
        for(int i=0;i<nums.length;i++){
              ar[i]=(long)nums[i]*nums[i];

        }
         Arrays.sort(ar);
         for(int i=0;i<ar.length/2;i++)
        {
            r-=ar[i];
        }
        for(int i=ar.length/2;i<ar.length;i++){
            r+=ar[i];
        }
        
        return r;
    }
}