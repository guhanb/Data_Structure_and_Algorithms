public class SingledimensionalArray {
    int[] arr = null;

    public SingledimensionalArray(int SizeofArray){
        arr = new int[SizeofArray];
        for(int i = 0 ; i < arr.length ; i ++){
            arr[i] = Integer.MAX_VALUE;
        }
    }

    public void insert(int position , int numTobeinserted){
        try{
            if(arr[position] == Integer.MAX_VALUE){
                arr[position] = numTobeinserted;
                System.out.println("successfully inserted");
            }
            else{
                System.out.println("this cell is already occupied");
            }
            
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Invalid index to access array");
        }
    }

    public static void main(String[] args) {
        SingledimensionalArray sda = new SingledimensionalArray(10);
        sda.insert(1, -10);
        sda.insert(2, 1000);
        sda.insert(11, 13);

        var element = sda.arr[5];
        System.out.println(element);
    }
}
