package ARRAY.twodimensionalarray;

import java.util.Arrays;

public class inserting {
    int[][] arr = null;

    public inserting(int numofrows , int numofcolumns){
        this.arr = new int[numofrows][numofcolumns];
        for(int i = 0 ; i < arr.length; i ++){
            for(int j = 0 ; j < arr.length ; j++){
                arr[i][j] = Integer.MAX_VALUE;
            }
        }
    }

    public void insert(int value , int row , int col){
        try{
            if(arr[row][col]== Integer.MAX_VALUE){
                arr[row][col] = value;
                System.out.println("the value is succesfully inserted");
            }
            else{
                System.out.println("This cell is already occupaid");
            }

        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("out of range");
        }
    }

    public void searching(int key){
        for(int row = 0 ; row<arr.length ; row++){
            for(int col = 0 ; col < arr.length ; col++){
                if(arr[row][col] == key){
                    System.out.println("\nKey is found in row " + row + " and col " + col);
                    return;
                }
                
            }
        }
        System.out.println("key is not found");
    }
     
    

    public static void main(String[] args){
        inserting tda = new inserting(5, 5);
        System.out.println(Arrays.deepToString(tda.arr));
        tda.insert(10, 0, 0);
        tda.insert(20, 1, 1);
        tda.insert(30, 2, 2);
        tda.insert(40, 3, 3);
        tda.insert(50, 4, 4);
        tda.insert(60, 5, 5);
        System.out.println(Arrays.deepToString(tda.arr));
        tda.searching(0);
        

    }

}
