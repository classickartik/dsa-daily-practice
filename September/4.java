//367. Valid Perfect Square

class Solution {
    public boolean isPerfectSquare(int x) {
        int start = 1;
        int end = x/2;
        int mid;
        if(x==1){
            return true;
        }
        while(start <= end){
            mid = start + (end-start)/2;
            // System.out.println(start);
            // System.out.println(mid);
            // System.out.println(end);
            if(mid<x/mid){
                start = mid+1;
            }
            else if(mid>x/mid){
                end = mid-1;
            }
            else{
                return x%mid==0;
            }
        }
        return false;
    }
}
