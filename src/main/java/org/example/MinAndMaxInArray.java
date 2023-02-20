/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 08-02-2023
 *Created With : IntelliJ IDEA Community Edition
 */


package org.example;

import java.util.*;
import java.util.Scanner;

public class MinAndMaxInArray {
    public static void main(String[] args) {
//        MinAndMaxInArray.findMinAndMaxInArray();
        findSecondLargestElement();

    }

    public static void findMinAndMaxInArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the array elements : ");
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The minimum number in the array is : " + min);
        System.out.println("The maximum number in the array is : " + max);
    }

    public static int findSecondLargestElement() {
        //Second-Largest number in an array
        int arr[] = {11, 45, 10, 10, 76, 76};
        int n = arr.length;
        Arrays.sort(arr);     //10,10,11,45,76,76
        int secondLargest = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                secondLargest = arr[i];
                break;
            }
        }
        System.out.println("Second largest/maximum number is: " + secondLargest);
        return n;
    }


}
