bool subsetsum(vector <int>& arr,int sum, int n){
    int t[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(j==0){
                    t[i][j]=true;
                }
                else if(i==0){
                    t[i][j]=false;
                }
                else if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
            
        
        }
    return t[n][sum];
    
}

class Solution {
public:
    bool canPartition(vector<int>& nums) {
        int n=nums.size();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        else{
            return subsetsum(nums,sum/2,n);
        }
        
    }
};
