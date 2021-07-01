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

    }

    public static void main(String[] args) {
        int arr[] = new int[] {4,5,7,2,1};
        bubblesort BS = new bubblesort();
        BS.print(arr);
        BS.bubbleSort(arr);
        BS.print(arr);
        

    }
}
