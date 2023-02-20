/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 08-02-2023
 *Created With : IntelliJ IDEA Community Edition
 */


package org.example;

import java.util.Scanner;

public class NegativeElementInArray {
    public static void main(String[] args) {
        NegativeElementInArray.negativeElements();
    }
    public static int negativeElement(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int array1[] = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        int negativeCount = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]<0){
                negativeCount ++;
                // Print the negative numbers in the array
                System.out.println("The negative elements are : " + array1[i]);
            }
        }
        //Print the total negative numbers in the array
        System.out.println("The total negative element in the array is : " + negativeCount);
        return 0;
    }

    //Use Signum method to find the negative numbers
    public static int negativeElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Negative numbers are : ");
        for(int i=0; i<arr.length; i++){
            if(Math.signum(arr[i]) == -1.0){
                System.out.println(Math.round(arr[i]));
            }
        }
        return size;
    }

}
