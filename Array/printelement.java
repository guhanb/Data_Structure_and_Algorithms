public class printelement {
    
    public void arrayDisplay(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i <n ;i++){
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int[] myarray = new int[5];
        myarray[0] = 1;
        myarray[1] = 2;
        myarray[2] = 3;
        myarray[3] = 4;
        myarray[4] = 5;
        myarray[2] = 7;
        arrayDisplay(myarray);
        System.out.println("length of array "+myarray.length);
        
    }

    public void arraydemo1(){
        int[] arr1 = {2,3,5,7,4,7};
        arrayDisplay(arr1);
        System.out.println("Length of array :" + arr1.length);
    }

    public static void main(String[] args){
        printelement arrutil = new printelement();
        arrutil.arrayDemo();
        arrutil.arraydemo1();
    }
}
