
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }

        }
        return smallest;

    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == smallest) {          
                smallestIndex = i;
            }

        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        /* int smallest = table[startIndex];  // -1, 3, 1, 7, 4, 5, 2, 4, 3  start index 3
        int smallestIndex = startIndex;
        for (int i = startIndex ; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                smallestIndex = i;

            }

        }
        return smallestIndex;  */
        
        int[] arr2=Arrays.copyOfRange(table, startIndex, table.length);
        return indexOfSmallest(arr2)+ startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp;
        temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            
            swap(array, i, indexOfSmallestFrom(array,  i));
            
        }

}
    

}
