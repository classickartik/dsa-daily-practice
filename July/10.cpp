
class Solution {
public:
    int largestSumAfterKNegations(vector<int>& nums, int k) {
        int n=nums.size();
        for(int i=0;i<n-1;i++){
            int idx=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[idx]){
                    idx=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;
        }
        int sum=0;
        int i=0;
        while(k){
        
            if(nums[i]<0){
                nums[i]=-nums[i];
                i++;
                k--;
            }
            else if(nums[i]==0){
                k=0;
                
                break;
                
            }
            else if(nums[i]>0){
                for(int i=0;i<n-1;i++){
            int idx=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[idx]){
                    idx=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;
        }
                i=0;
                if(k%2==0){
                    k=0;
                    
                }
                else{
                    nums[i]=-nums[i];
                    k=0;
                }
               
            }
        }
        for(int i=0;i<n;i++){
            cout<<nums[i]<<" ";
            sum+=nums[i];
            cout<<sum<<endl;
        }
        
        return sum;
    }
    
};
