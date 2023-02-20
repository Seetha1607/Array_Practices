/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 08-02-2023
 *Created With : IntelliJ IDEA Community Edition
 */


package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOneArrayToOther {
    public static void main(String[] args) {

        int array1[]={1,2,3,4,5};
        int array2[] = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println("Elements in array1 are : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("Elements in array2 are : ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
