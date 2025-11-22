class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<Integer>();
        int[] appeared = new int[nums.length+1];
        for(int i = 0; i < nums.length; i++){
            appeared[nums[i]]++; 
        }
        for(int i = 0; i < nums.length+1; i++){
            if (i!= 0 && appeared[i] == 0) arr.add(i);
        }
        return arr;
    }
}