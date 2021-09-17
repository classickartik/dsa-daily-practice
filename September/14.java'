//645. Set Mismatch

class Solution {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correctindex = arr[i]-1;
            if(arr[correctindex]!=arr[i]){
                int temp = arr[i];
                arr[i] = arr[correctindex];
                arr[correctindex] = temp;
            }
            else{
                i++;
            }
        }
        int ans[] = {arr.length,arr.length+1};
        for(int j = 0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ans[0]=arr[j];
                ans[1]=j+1;
            }    
        }
        return ans;
    }
}
