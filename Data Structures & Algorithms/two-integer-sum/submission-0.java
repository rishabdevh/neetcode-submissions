class Solution {
    public int[] twoSum(int[] nums, int target) {
        int first=0,last=nums.length-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
