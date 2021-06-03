public class resize {
    public void display(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n ; i ++){
            System.out.print(arr[i]+"|");
        }
        System.out.println();
    }

    public int[] resizearray(int arr[], int capacity){
        int[] temp = new int[capacity];
        for(int i = 0 ; i < arr.length ; i ++){
            temp[i] = arr[i];
        }
        
        arr = temp;
        return arr;
    }

    public static void main(String[] args){
        resize myArray = new resize();
        int[] original = {1,4,2,5,7};
        System.out.println("length of Array :" + original.length);
        original = myArray.resizearray(original, 10);
        System.out.println("Length of Array :" + original.length );
    }
}
