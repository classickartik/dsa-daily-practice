//Richest Customer Wealth

class Solution {
    public int maximumWealth(int[][] arr) {
        int sum=0;
        int max=-1;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            if(sum>max){
                max=sum;
                
            }
        }
        return max;
    }
}
