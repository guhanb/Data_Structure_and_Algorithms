package Sorting;

public class bubblesort {

    public void print(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }

    public void bubbleSort(int[] arr){
       int n = arr.length;
       boolean isSwapped;
       for(int i= 0 ; i < n -1 ; i++){
           isSwapped = false;
           for(int j = 0 ; j < n -1 -i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
           }
           if(isSwapped == false){
               break;
           }
       }
    }

    public void insertionsort(int[] arr){
        int n = arr.length;
        for(int i = 1 ; i < n ; i ++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j = j -1;
            }
            arr[j + 1] = temp;
        }
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
        BS.print(arr);
        BS.bubbleSort(arr);
        BS.print(arr);
        int arr1[] = new int[] {3,5,2,7,5};
        BS.insertionsort(arr1);
        BS.print(arr1);
        int arr2[] = new int[] {10,23,2,4,5};
        BS.selectionsort(arr2);
        BS.print(arr2);


    }
}
