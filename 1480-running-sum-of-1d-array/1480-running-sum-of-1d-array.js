/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    var ans=[];
    var sum=0;
    for(let i=0;i<nums.length;i++){
        sum+=nums[i];
        ans.push(sum);
    }
    return ans;
};