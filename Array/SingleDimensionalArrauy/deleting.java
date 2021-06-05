public class deleting {
    int[] arr = null;

    public deleting(int sizeOfArray){
        arr = new int[sizeOfArray];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = Integer.MAX_VALUE;
        }
    }

    public void insert(int position , int valueTobeInserted){
        try{
            if(arr[position] == Integer.MAX_VALUE){
                arr[position] = valueTobeInserted;
                System.out.println("Successfully inserted");
            }
            else{
                System.out.println("this index is filled");
            }
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("this index is out of given index");
        }

    }

    public void display(){
        for(int i = 0; i<arr.length; i  ++){
            System.out.print(arr[i] + "|");
        }
        System.out.println();

    }
    public void deletingvalue(int indextobedeleted){
        try{
            arr[indextobedeleted] = 0;
            System.out.println("Successfully deleted");
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("The given index is out of range");
        }
    }

    public static void main(String[] args) {
        deleting sda = new deleting(10);
        sda.insert(1, 10);
        sda.insert(0, 11);

        sda.display();
        sda.deletingvalue(1);
        sda.display();
        
    }
}


