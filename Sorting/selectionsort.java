package Sorting;

public class bubblesort {

    public void print(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }


    public void selectionsort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++ ){
            int min = i;
            for(int j = i+1 ; j < n ; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] {4,5,7,2,1};
        bubblesort BS = new bubblesort();
        BS.selectionsort(arr);
        BS.print(arr);


    }
}
