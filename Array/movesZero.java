public class movezeros {
    public void display(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }

    public void movezerosend(int arr[], int n){
        int j = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {20,19,0,23,0,22};
        movezeros myarray = new movezeros();
        myarray.display(array);
        myarray.movezerosend(array, array.length);
        myarray.display(array);
    }
}
