/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 19-02-2023
 *Created With : IntelliJ IDEA Community Edition
 */


package org.example;

import java.util.Scanner;
public class ReverseString{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        ReverseString reverse = new ReverseString();
        System.out.println("Enter the string to be reversed : ");
        String word = sc.next();
        String reversedWord = reverse.reverseString(word);
        System.out.println("The reversed String is : " +reversedWord);

    }

    public String reverseString(String word){
        if(word.isEmpty()){
            return word;
        }
        return reverseString(word.substring(1)) + word.charAt(0);
    }
}