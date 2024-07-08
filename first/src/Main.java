import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int[] array = new int[10];
    static int[][] matrix = new int[10][10];

    //printArray
    public static void printArray(int[] ar) {
        System.out.println("Current Array:");
        for (int itter = 0; itter < ar.length; itter++) {
            System.out.print(ar[itter]+"\t");
        }
        System.out.println();
    }

    //printMatrix
    public static void printArray(int[][] mt) {
        System.out.println("Current Matrix:");
        for (int itter1 = 0; itter1 < mt[0].length; itter1++) {
            for (int itter2 = 0; itter2 < mt[1].length; itter2++) {
                System.out.print(mt[itter1][itter2]+"\t");
            }
            System.out.println();
        }
    }

    //randomizeMatrix
    public static void randomArray (int[][] mt) {
        for (int itter1 = 0; itter1 < mt[0].length; itter1++) {
            for (int itter2 = 0; itter2 < mt[1].length; itter2++) {
                mt[itter1][itter2] = new Random().nextInt(100);
            }
        }
        System.out.println("Matrix randomized");
    }

    //randomizeArray
    public static void randomArray(int[] ar){
        for (int itter = 0; itter < ar.length; itter++) {

            ar[itter] = new Random().nextInt(100);
        }
        System.out.println("Array randomized");
    }

    //reverseArray
    public static void reverseArray(int[] ar) {
        for (int itter = 0; itter < ar.length/2;itter++) {
            int tmp = ar[itter];
            ar[itter]=ar[ar.length-itter-1];
            ar[ar.length-itter-1]=tmp;
        }
        System.out.println("Array reversed");
    }

    public static void main(String[] args) {
        printArray(array);
        randomArray(array);
        printArray(array);
        reverseArray(array);
        printArray(array);
        Arrays.sort(array);
        printArray(array);
        printArray(matrix);
        randomArray(matrix);
        printArray(matrix);
    }
}

