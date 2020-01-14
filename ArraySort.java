package array;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers=new int[10];
        printArray(numbers);
        initializeArray(numbers);
        printArray(numbers);
        bubbleSort(numbers);
        printArray(numbers);

    }
    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] array){
        for(int j=0;j<array.length-1;j++){
            for(int i=0;i<array.length-1;i++){
                if(array[i]>array[i+1]){
                    swapArray(i,i+1,array);
                }
            }
        }

    }
    public static void swapArray(int i,int i1,int[] array){
        int temp=array[i];
        array[i]=array[i1];
        array[i1]=temp;
    }
    public static void initializeArray(int[] array){
        for(int i=0;i<array.length;i++){
            array[i]=10-i;
        }
    }
}
