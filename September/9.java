//1351. Count Negative Numbers in a Sorted Matrix

class Solution {
    public int countNegatives(int[][] arr) {
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            int s = 0;
            int e = arr[0].length-1;
            int mid;
            while(s<e){
                mid = s + (e-s)/2;
                if(arr[i][mid]<0){
                    e = mid;
                }
                else{
                    s = mid + 1;
                }
                
            }
            if(arr[i][s]<0){
                count += arr[0].length - s;
            }
            
        }
        return count;
        
    }
}
