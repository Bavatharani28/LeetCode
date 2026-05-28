class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        int num=0;
        for(Map.Entry<Integer,Integer> e:hmap.entrySet()){
            if(e.getValue()>(nums.length/2))
            num=e.getKey();
        }
        return num;
    }
}