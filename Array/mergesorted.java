public class mergesorted {
    public void display(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }

    public int[] merge(int arr1[],int arr2[],int n , int m){
        int[] result = new int[n + m];
        int i = 0 ; int j = 0; int k = 0;
        while(i < n && j < n){
            if(arr1[i] <= arr2[j]){
                result[k] = arr1[i];
                i++;
            }
            else{
                result[k] = arr2[j];
                j ++;
            }
            k ++;     
        }
        while(i<n){
            result[k] = arr1[i];
            i++ ; k++;
        }
        while(j<n){
            result[k] = arr2[j];
            j++ ; k++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,7,4,9};
        int[] array2 = {3,2,6,8,3};

        mergesorted myarray = new mergesorted();
        int[] result =myarray.merge(array1, array2, array1.length, array2.length);
        myarray.display(result);
    }
}
