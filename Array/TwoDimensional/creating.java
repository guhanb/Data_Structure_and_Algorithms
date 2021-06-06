package ARRAY.twodimensionalarray;
import java.util.Arrays;


class creating {
    public static void main(String[] args) {

        //1. Declare
        int[][] int2DArray ;

        //2. Instantiate
        int2DArray = new int[2][2];

        //3. Initialize
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 9;
        int2DArray[1][0] = 8;
        int2DArray[1][1] = 10;

        System.out.println(Arrays.deepToString(int2DArray));


        // other way

        String myarray[][] = {{"a","b"},{"c","d"}};
        System.out.println(Arrays.deepToString(myarray));
    }
}
