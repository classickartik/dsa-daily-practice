//448. Find All Numbers Disappeared in an Array

class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr){
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
        // System.out.print(Arrays.toString(arr));
        List<Integer> ans = new ArrayList<>();
        for(int j = 0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
}
