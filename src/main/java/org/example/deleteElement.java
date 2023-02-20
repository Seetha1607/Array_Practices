/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 10-02-2023
 *Created With : IntelliJ IDEA Community Edition
 */


package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
//        deleteElement();
//        deleteElementByIndex();
                int[] numbers = {10, 20, 30, 40, 50};
                int index = 3;

                System.out.println("Original Array: " + Arrays.toString(numbers));

                int[] newArray = new int[numbers.length - 1];
                for (int i = 0, j = 0; i < numbers.length; i++) {
                    if (i == index) {
                        continue;
                    }
                    newArray[j++] = numbers[i];
                }

                System.out.println("Array after deletion: " + Arrays.toString(newArray));
            }


    //delete element by entering the element value
    public static void deleteElement() {
        int deleteElement, item;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to delete : ");
        deleteElement = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == deleteElement) {
                boolean a = true;
                System.out.println("Element Found");
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        System.out.println("After Removing, the array is : ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    //delete element by using index number
    public static void deleteElementByIndex() {
        int location, item;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            System.out.print("Please give value for index " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the index number to delete : ");
        location = scanner.nextInt();
        for (int i = location; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.print("\n The elements in array after deletion are  : ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
