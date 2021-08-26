//Binary Search in Rotated Array

class Solution {
    public int search(int[] arr, int target) {
        int peak = findPeak(arr);
      
      if(peak==-1){
        return binarySearch(arr, target, 0, arr.length-1);
      }  
      if(arr[peak]==target){
        return peak;
      }
      if(target>=arr[0]){
          return binarySearch(arr, target, 0, peak-1);
        }
      else{
        return binarySearch(arr, target, peak+1, arr.length-1);
      }
    }
  
  public int binarySearch(int arr[], int target, int s, int e){
        
        while(s<=e){
            int mid = s + (e-s)/2;
            if(target<arr[mid]){
                e=mid-1;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    

  
  public int findPeak(int arr[]){
    int s=0;
    int e=arr.length-1;
    while(s<=e){
      int m = s + (e-s)/2;
      if(m<e && arr[m]>arr[m+1]){
        return m;
      }
      else if(m>s && arr[m]<=arr[m-1]){
        return m-1;
      }
      else if(arr[s]>=arr[m]){
        e = m-1;
      }
      else{
        s = m+1;
      }
    }
    return -1;
  }
}
