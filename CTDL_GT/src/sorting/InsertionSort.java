package sorting;

public class InsertionSort {

    public static void sort(int []arr){
        int length = arr.length ;
        for(int i =1;i<length ;i++){
            int j = i-1;
            int temp = arr[i];

            while(j >=0 && arr[j] > temp){
                arr[j +1]= arr[j];
                j-=1;
            }

            arr[j+1] = temp;
        }
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        int [] arr = {2,4,1,2,6,7,5,3,4,9,0,5,4};

        sort(arr);
    }
}
