package com.hillel.lesson1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number:");

        int numberVariable = scanner.nextInt();

        if (numberVariable % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Не четное число");
        }

    }
}
