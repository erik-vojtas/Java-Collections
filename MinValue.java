import java.util.Scanner;

// Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
// The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
// Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
// In the main() method read the count from the console and call the method readIntegers() with the count parameter.
// Then call the findMin() method passing the array returned from the call to the readIntegers() method.
// Finally, print the minimum element in the array.


public class MinValue {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter a numbers from 1 to 5 please: ");
        int amount = scanner.nextInt();

        int[] myArray = getIntegers(amount);
        printArray(myArray);
        getMinValueFromArray(myArray);

    }

    public static int[] getIntegers(int amount) {
        int[] new_array = new int[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter number #" + (i + 1) + ": ");
            new_array[i] = scanner.nextInt();
        }
        return new_array;
    }

    public static void printArray(int[] array) {
        System.out.print("Array: ");
        for (int x : array) {
            System.out.print(x + ", ");
        }
        System.out.println();
    }

    public static int getMinValueFromArray(int[] array) {
        int min_value = Integer.MAX_VALUE;
        for(int x : array) {
            if (min_value > x) {
                min_value = x;
            }
        }
        System.out.println("Min Value = " + min_value);
        return min_value;
    }



}
