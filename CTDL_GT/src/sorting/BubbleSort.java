package sorting;

public class BubbleSort {

    public static void sort(int [] arr){
        int length = arr.length ;
        for(int i =0;i<length -1;i++){
            for(int j=0;j< length -1 -i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];

                    arr[j] = arr[j +1];

                    arr[j+1] = temp;
                }
            }
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
