import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] myArray = {2,9,6,4,1,10,13};
        System.out.println("Original array: "+ Arrays.toString(myArray));
        reverseArray(myArray);
        System.out.println("Reversed array: "+ Arrays.toString(myArray));

        sortArray2(myArray);
        sortArray1(myArray);


//        int[] myIntegers = getIntegers(5);

    }

    public static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] newIntegers = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            System.out.println("Enter a number #" + (i+1) + ": ");
            newIntegers[i] = scanner.nextInt();
        }
        printArray(newIntegers);
        sortArray2(newIntegers);
        return newIntegers;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void sortArray1(int[] array) {
        Arrays.sort(array);
        System.out.print("Sorted array descending: ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static int[] sortArray2(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length); //create a copy of array
        boolean sorted = false;
        System.out.print("Sorted array ascending: ");
        while (!sorted) {
            sorted = true;
            for(int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        printArray(array);
        return sortedArray;
    }

    public static void reverseArray(int[] array) {
        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }


}
