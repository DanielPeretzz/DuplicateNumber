package com.company.danielproject;


import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumber {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter a number amount : ");
        int amount = SCANNER.nextInt();
        final int[] arrOfNum = new int[amount];
        for (int i = 0; i < arrOfNum.length ;i++){
            System.out.print("Enter a number ; ");
            arrOfNum[i] = SCANNER.nextInt();
        }
        Arrays.sort(arrOfNum);
        System.out.print("Sorted number from the smallest to the largest :");
        for(int i = 0; i < arrOfNum.length; i++){

            System.out.print(" " + arrOfNum[i]);
        }
        for(int i = 0; i < arrOfNum.length; i++) {
            for(int j = i + 1; j < arrOfNum.length; j++) {
                if(arrOfNum[i] == arrOfNum[j])
                    System.out.println("\n The duplicate number is : " + arrOfNum[j]);
            }

        }





    }
}
