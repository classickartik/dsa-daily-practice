//287. Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] arr) {
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
        
        for(int j = 0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return arr[j];
            }    
        }
        // System.out.print(Arrays.toString(arr));
        return arr.length;
    }
}
