//278. First Bad Version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int end) {
        int start = 1;
        int mid;
        while(start < end){
            mid = start + (end-start)/2;
            if(isBadVersion(mid) && isBadVersion(mid-1)){
                end = mid-1;
            }
            else if(isBadVersion(mid)){
                end=mid;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}
