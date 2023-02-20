/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 08-02-2023
 *Created With : IntelliJ IDEA Community Edition
 */


package org.example;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {

        CountEvenOdd.checkEvenOrAdd();

        int[] array = {10,20,30,32,5,33,4,3,5,3,98};
        int evenCount = 0 , oddCount = 0;
            for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Total Even Numbers in the array : " + evenCount);
        System.out.println("Total Odd Numbers in the array : " + oddCount);
        System.out.println("Total elements in the array : " + array.length);
    }

    // Enter the elements and check whether its odd or even
    public static void checkEvenOrAdd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int array1[] = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        int even = 0; int odd = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]%2 ==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Total Even Numbers in the array : " + even);
        System.out.println("Total Odd Numbers in the array : " + odd);
    }
}
