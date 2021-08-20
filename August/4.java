//Floor of a number in a sorted array.
//Output the greatest number less than or equal to target.
//Tags - Binary Search

public class Floor {
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,7,8,9,11,15,17,19,20,21,36,45};
        int target=15;
        System.out.println(floor(arr,target));
    }
    static int floor(int arr[], int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return arr[mid];
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
        }
        return arr[end];
    }
}
