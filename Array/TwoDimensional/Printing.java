public class printing {
    int[][] arr= null;

    public printing(int numofrows , int numofcolumns){
        this.arr = new int[numofrows][numofcolumns];
        for(int i = 0 ; i < arr.length; i ++){
            for(int j = 0 ; j < arr.length ; j++){
                arr[i][j] = Integer.MAX_VALUE;
            }
        }
    }

    public void display(){
        for(int rows = 0 ; rows <arr.length;rows++ ){
            for(int col = 0 ; col < arr.length;col++){
                System.out.print(arr[rows][col]+",");
            }
            System.out.println();
        }
    }

    //deleting
    public void deleting(int row , int col){
        try{
            System.out.println("Deleting value is " + arr[row][col]);
            arr[row][col] = 0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of range");
        }

    }
    
    // accessing value
    public void accesscell(int row , int col){
        System.out.println("\nAccessing Row " + row +",col "+col);
        try{
            System.out.println("Accessed value "+ arr[row][col]);
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("out of rang,e");
        }
   }
    public static void main(String[] args) {
        printing tda = new printing(5, 5);
        tda.display();
        tda.accesscell(2, 2);
        tda.deleting(2, 2);
        tda.display();
    }
}
