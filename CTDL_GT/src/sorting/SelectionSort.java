package sorting;

public class SelectionSort {

    public static void sort(int [] arr){
        int length = arr.length;
        for(int i= 0;i < length;i++){

            int index = i;
            for(int j= i+1;j<length;j++){
              if(arr[index] > arr[j]){
                  index = j;
              }

            }

            int temp = arr[i];

            arr[i] = arr[index];

            arr[index] = temp;
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
