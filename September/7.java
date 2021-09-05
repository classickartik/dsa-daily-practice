//167. Two Sum II - Input array is sorted

class Solution {
    public int[] twoSum(int[] arr, int target) {
        int l=0; 
        int r=arr.length-1;
        while(arr[l]+arr[r]!=target){
            if(arr[l]+arr[r]>target){
                r--;
            }
            else{
                l++;
            }
        
        }
        int ans[]={l+1,r+1};
        return ans;
    }
   
}
