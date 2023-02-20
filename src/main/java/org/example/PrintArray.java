/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 08-02-2023
 *Created With : IntelliJ IDEA Community Edition
 */


package org.example;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
//        PrintArray.printArray();
        PrintArray.countArray();
    }
    public static int[] printArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("The array elements are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }

    //count Total elements in a array
    public static void countArray(){
        int array2[] = {1,2,3,4,5};
        System.out.println(array2.length);
    }


}
