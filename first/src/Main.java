import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int[] array = new int[11];

    //printArray
    public static void printArray(int[] ar) {
        for (int itter = 0; itter < ar.length; itter++) {
            System.out.print(ar[itter]+"\t");
        }
        System.out.println();
    }

    //randomizeArray
    public static void randomArray(int[] ar){
        for (int itter = 0; itter < ar.length; itter++) {

            ar[itter] = new Random().nextInt(100);
        }
    }

    //reverseArray
    public static void reverseArray(int[] ar) {
        for (int itter = 0; itter < ar.length/2;itter++) {
            int tmp = ar[itter];
            ar[itter]=ar[ar.length-itter-1];
            ar[ar.length-itter-1]=tmp;
        }
    }


    public static void main(String[] args) {
        printArray(array);
        randomArray(array);
        printArray(array);
        reverseArray(array);
        printArray(array);
    }
}

