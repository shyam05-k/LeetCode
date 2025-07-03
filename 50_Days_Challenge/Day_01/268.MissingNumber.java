Question: https://leetcode.com/problems/missing-number/
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int curr=0;
        for(int i:nums){
            if(i!=curr){ 
            break;
        }
        curr++;
    }
    return curr;
    }
}
