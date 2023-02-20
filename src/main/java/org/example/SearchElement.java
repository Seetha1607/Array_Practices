/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 10-02-2023
 *Created With : IntelliJ IDEA Community Edition
 */


package org.example;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int searchElement;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to search : ");
        searchElement = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement){
                count++;
            }
        }
        if(count<0){
            System.out.println("The element is not found");
        } else {
            System.out.println("The element found " + count +" times");
        }
    }
}
