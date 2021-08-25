//Find in Mountain Array

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        
        int size = arr.length()-1;
      
        int peak = findPeak(arr, size);
   
        int ans = binarySearch(arr, target, 0, peak);

        if(ans!= -1){
            return ans;
        }
        else{
            return binarySearch(arr, target, peak, size);
        }
    }
    public int binarySearch(MountainArray arr, int target , int s, int e){
        if(arr.get(s)<arr.get(e)){
            while(s<=e){
                int m = s + (e-s)/2;
                if(target>arr.get(m)){
                    s = m + 1;
                }
                else if(target<arr.get(m)){
                    e = m - 1;
                }
                else{
                    return m;
                }
            }
            return -1;
        }
        else{
            while(s<=e){
                int m = s + (e-s)/2;
                if(target<arr.get(m)){
                    s = m + 1;
                }
                else if(target>arr.get(m)){
                    e = m - 1;
                }
                else{
                    return m;
                }
            }
            return -1;
        }
    }
    
    public int findPeak(MountainArray arr, int e) {
        int s=0;
        
        while(s<e){
            int mid = s + (e-s)/2;
            if(arr.get(mid)>arr.get(mid+1) ){
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }  
}
