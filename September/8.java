//1539. Kth Missing Positive Number

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s = 0;
        int e = arr.length;
        int mid = 0;
        while(s<e){
            
            mid = s + (e-s)/2;
            if(arr[mid] - 1 - mid < k){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s+k;
        
    }
}
