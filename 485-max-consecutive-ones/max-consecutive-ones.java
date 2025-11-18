class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxAbs = 0;
        int maxRel = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==1){
                maxRel++;
            }
            else{
                maxAbs = Math.max(maxAbs, maxRel);
                maxRel = 0;
            }
        }
        maxAbs = Math.max(maxAbs, maxRel);
        return maxAbs;   
    }
}