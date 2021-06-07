package ARRAY;

import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many days Temperature");
        int numDays = console.nextInt();
        // record temperature and find average
        int temps[] = new int[numDays];
        int sum = 0;
        for(int i = 0 ; i<numDays ; i++){
            System.out.println("Day"+ (i+1) + " Temperature =");
            temps[i] = console.nextInt();
             
            sum += temps[i];
        }

        double Average = sum/numDays;
        // count days above average
        int count = 0;
        for(int i = 0 ; i < temps.length ; i++){
            if(temps[i] > Average){
                count++;
            }
        }
        System.out.println();
        System.out.println("Average Temperature :" + Average);
        System.out.println(count + " days above the temperature");
    }
}
