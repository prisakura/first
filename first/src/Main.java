import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[11];
        //random array
        for (int itter = 0; itter < array.length; itter++) {

            array[itter] = new Random().nextInt(100);
            System.out.print(array[itter]+"\t");
        }
        System.out.println();
        //reverse
        for (int itter = 0; itter < array.length/2;itter++) {
            int tmp = array[itter];
            array[itter]=array[array.length-itter-1];
            array[array.length-itter-1]=tmp;
        }
        //print
        for (int itter = 0; itter < array.length; itter++) {
            System.out.print(array[itter]+"\t");
        }
    }
}

