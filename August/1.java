//Find Numbers with Even Number of Digits

class Solution {
    public int findNumbers(int[] arr) {
        int count=0;
        
        for(int i=0;i< arr.length;i++){
            int digits=0;
            while(arr[i]>0){
                
                arr[i]=arr[i]/10;
                digits++;
            }
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
    
}
