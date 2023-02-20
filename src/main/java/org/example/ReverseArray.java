/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 08-02-2023
 *Created With : IntelliJ IDEA Community Edition
 */


package org.example;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray.reverseArray();
    }
    // Reverse Array using temp variable
    public static void reverseArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("The reversed Array is :");
       for (int i = size -1; i >= 0; i--){
           System.out.println(array[i]);
       }
    }
}
