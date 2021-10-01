//1011. Capacity To Ship Packages Within D Days

class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int s = arr[0];
        int e = 0;
        for(int i = 0; i<arr.length ; i++){
            e+=arr[i];
            s=Math.max(s,arr[i]);
        }
        while(s<e){
            int curr = 0;
            int daysneeded=1;
            int mid = s + (e-s)/2;
            for(int w : arr){
                if(curr+w>mid){
                    daysneeded++;
                    curr=0;
                }   
                curr+=w;
            }
            if(daysneeded>days){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
            return s;
    }
}
