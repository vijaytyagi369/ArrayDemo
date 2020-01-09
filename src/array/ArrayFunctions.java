/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 09/01/20
 *   Time: 10:03 AM
 */

package array;

public class ArrayFunctions {
    /**
     * This method will insert an integer value in an integer array at the last index.
     * If the array is already full, it will do nothing.
     *
     * @param array the integer array in which the value is to be inserted
     * @param value the value that is to be inserted
     */
    public void insertValue(int[] array, int value) {
        array[array.length - 1] = value;

    }

    /**
     * This method is the overloaded form of the {@code insertValue()} method which
     * lets the user tell the index at which the value is to be inserted.
     * If the index already has a value, this method will override it.
     *
     * @param array the integer array in which the value is to be inserted
     * @param value the value that is to be inserted
     * @param index the index at which the value is to be inserted
     */
    public void insertValue(int[] array, int value, int index) {
        array[index] = value;

    }

    /**
     * This method will delete a value inside the array.
     * It will first search for the value inside the array, if the value exists,
     * then the array value will be deleted, and the method will return {@code true}.
     * If the value does not exist inside the array, then the method will return {@code false}.
     *
     * @param array the integer array in which the value is to be deleted.
     * @param value the value which is to be deleted.
     * @return {@code true} if the value was deleted; {@code false} if the value was not present.
     */
    public boolean deleteValue(int[] array, int value) {

        return false;
    }

    /**
     * This method is the overloaded form of the {@code deleteValue()} method which
     * lets the user to delete a value based on an index of the array.
     */
    public boolean deleteValue(int index, int[] array) {
        return false;
    }

    /**
     * This method will search for an integer value inside an integer array.
     */
    public boolean searchValue(int[] array, int value) {
        return false;
    }

    /*
     * This method will sort the values of the integer array in an increasing order.
     * */
    public void sortValues(int[] array) {

    }

    /*
     * This method will traverse the array and print all the values.
     * */
    public void printArrayValues(int[] array) {

    }
}
