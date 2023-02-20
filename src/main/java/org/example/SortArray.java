/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 10-02-2023
 *Created With : IntelliJ IDEA Community Edition
 */


package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
//        bubbleSort();
//        sort();
        for(int i =1; i<7; i++){
            for(int j =1; j<=20; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void sort() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        Arrays.sort(array1);
        System.out.println("Arrays after ascending : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println();

        // Descending -- reverse for loop
        System.out.println("Arrays after descending : ");
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i] + ", ");
        }
    }

    //Bubble sort
    public static void bubbleSort() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        //bubble sort -- ascending
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Arrays after ascending : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        //bubble sort -- descending
        int temp1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp1 = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp1;
                }
            }
        }
        System.out.println("Arrays after descending : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
