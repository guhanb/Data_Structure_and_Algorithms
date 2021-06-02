public class reverse {
    
    public void reversearray(int[] arr){
        int n = arr.length;
        for(int i = n - 1 ; n > i ; i--){
            
            System.out.print(arr[i] + "|");

            if(i == 0){
                System.out.println();
                return;
            }
            
        }
        System.out.println();
    }

    public void arrayDemo(){
        int[] arr1 = {1,2,4,5,6};
        reversearray(arr1);
        System.out.println("Length of array :"+ arr1.length);
    }

    public void arrayDemo1(){
        int[] arr2 = {6,5,4,3,2,1};
        reversearray(arr2);
        System.out.println("Length of array :"+ arr2.length);
    }


    

    public static void main(String[] args) {
        reverse arrutil = new reverse();
        arrutil.arrayDemo();
        arrutil.arrayDemo1();
    }
}
