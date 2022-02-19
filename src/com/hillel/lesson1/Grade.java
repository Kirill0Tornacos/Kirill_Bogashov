package com.hillel.lesson1;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your average grade:");

        int grade = scanner.nextInt();

        if (grade >= 1 && grade <= 3){
            System.out.println("Двоечник");
        }
        if (grade >= 4 && grade <= 6){
            System.out.println("Троечник");
        }
        if (grade >= 7 && grade <= 9){
            System.out.println("Хорошист");
        }
        if (grade >= 10 && grade <= 12){
            System.out.println("Отличник");
        }
        if (grade >= 0 && grade <= 13) {
            System.out.println("Не действительное число");
        }
    }
}
