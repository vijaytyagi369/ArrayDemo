/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 08/01/20
 *   Time: 3:46 PM
 */

package array;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
/*
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + ", ");
        }
*/
        /*for (int i : integers) {
            System.out.print(i + ", ");
        }*/
        int[] integers = new int[10];
        printArrayValues(integers);
        initialiseIntegerArray(integers);
        printArrayValues(integers);

    }

    /*public static boolean searchInArray(int[] array, int value) {

    }*/

    public static void printArrayValues(int[] integers) {
        System.out.println(Arrays.toString(integers));
    }

    public static void initialiseIntegerArray(int[] integerArray) {
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = (i + 1);
        }
    }
}
