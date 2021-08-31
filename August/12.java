//Split Array Largest Sum

class Solution {
    public int splitArray(int[] arr, int m) {
        int start = 0;
      int end = 0;

      for(int i=0;i<arr.length;i++){
          start = Math.max(start,arr[i]);
          end+=arr[i];
        }
      while(start<end){
            int mid = (start+end)/2;
            int sum = 0;
            int pieces = 1;
            for(int num : arr){
                  if(sum+num > mid){
                        pieces++;
                        sum=num;
                  }
                  else{
                        sum+=num;
                  }
                }
                
                if(pieces<=m){
                  end = mid;
                }
                else{
                  start = mid + 1;
                }
          
              
      
      }
        return end;
    }
  
}
