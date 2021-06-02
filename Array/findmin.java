public class findmim {

    // find min value
    public int findmimvalue(int arr[]){
        int min = arr[0];
        for(int i = 1;i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    // find max value
    public  int findmaxvalue(int arr[]){
        int max = arr[0] ;
        for(int i = 1 ; i < arr.length ; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] myarray = {8,4,5,9,20};
        findmim maxmin = new findmim();
        System.out.println("maximum value ;" + maxmin.findmaxvalue(myarray));
        System.out.println("minimum value ;" + maxmin.findmimvalue(myarray));

    }
}
