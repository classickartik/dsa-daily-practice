//Find First and Last Position of Element in Sorted Array

class Solution {
    public int[] searchRange(int[] arr, int target) {
        int ans[]={-1,-1};
        ans[0]=search(arr , target , true);
        if(ans[0]!=-1){
            ans[1]=search(arr, target , false);
        }
        
        
        
        
        return ans;
    }
    
    int search(int arr[],int target, boolean findStartIndex){
        int ans =-1;
        int start=0;
        int end=arr.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                //potential ans
                ans=mid;
                
                if(findStartIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        
        return ans;
    }
    
    
}
