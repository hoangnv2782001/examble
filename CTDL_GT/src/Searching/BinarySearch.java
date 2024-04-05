package Searching;

public class BinarySearch {

    public static int find(int [] arr , int value){
        int left = 0;

        int right = arr.length -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == value){
                return mid + 1;
            }

            if(arr[mid] < value){
                left = mid +1;
            }else{
                right = mid -1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 23;
        int result = find(arr, target);
        System.out.println(result);
    }
}
