package Searching;

public class LinearSearch {

    public static int search(int [] arr,int value){
        for(int i=0;i< arr.length;i++){
            if(arr[i] == value)
                return i+1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int []a= {1,4,2,2,3,2,1};
        System.out.println(search(a,3));
    }
}
