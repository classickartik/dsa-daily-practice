//875. Koko Eating Bananas

class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        if(arr.length==1){
                return arr[0]/h +  (arr[0]%h == 0? 0 : 1);
        }
        int s = 0;
        int e = 1000000000;
        while(s<e){
            int hrs = 0;
            int mid = s + (e-s)/2;
            for(int w : arr){
                hrs+=w/mid + (w%mid == 0? 0 : 1);
            }
            if(hrs>h){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;
    }
}
