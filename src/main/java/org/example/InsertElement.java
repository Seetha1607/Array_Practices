/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 09-02-2023
 *Created With : IntelliJ IDEA Community Edition
 */


package org.example;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
//        insertElementAtEndOfArray();
        insertElementAtAnyIndex();
    }

    //Insert element at the end of the array
    public static void insertElementAtEndOfArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size+1];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The array elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Insert the element at the end of the array : ");
        arr[size] = scanner.nextInt();
        System.out.println("After inserting the last element, the array is : ");
        for (int i = 0; i < size + 1; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void insertElementAtAnyIndex(){
        int location, item;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size+1];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the array location : ");
        location = scanner.nextInt();
        System.out.println("Enter the element want to insert in the location : ");
        item = scanner.nextInt();
        for (int i= size; i > location ; i--) {
            arr[i] = arr[i-1];
        }
        arr[location] = item;
        size++;
        System.out.println("After insertion, the array is : ");
        for (int b : arr) {
            System.out.println(b);
        }


    }
}
