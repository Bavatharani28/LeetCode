/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    const hash={};
    let ans=0;
    let maj=0;
    for(let num of nums){
        hash[num]=1+(hash[num]||0);
        if(hash[num]>maj)
        {
            maj=hash[num];
            ans=num;
        }
    }
    return ans;
};