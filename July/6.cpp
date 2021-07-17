class Solution {
public:
    int largestPerimeter(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        reverse(nums.begin(),nums.end());
        int peri=0;
        for(int i=0;i<nums.size()-2;i++){
            if(nums[i+1]+nums[i+2]>nums[i]){
                peri=nums[i]+nums[i+1]+nums[i+2];
                return peri;
            }
        }
        return 0;
    }
};
