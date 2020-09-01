import java.util.Arrays;
import java.util.Scanner;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

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
