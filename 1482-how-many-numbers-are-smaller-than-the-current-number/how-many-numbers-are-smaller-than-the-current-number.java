class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[101];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
        }

        for(int i = 1; i < 101; i++){
            arr[i] += arr[i-1];
        }

        for(int i = 0; i < nums.length; i++){
            int position = nums[i];
            if (position == 0) nums[i] = 0;
            else{
                nums[i] = arr[position - 1];
            }
        }
        return nums;
    }
}