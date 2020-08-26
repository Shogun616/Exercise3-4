package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    static String word;

    static int number;

    public static void main(String[] args) {

        boolean repeat = true;

        while (repeat) {

            input();

            if (number <= 10) {
                for (int i = 0; i < number; i++) {
                    System.out.print(word + " ");

                }

            } else
                repeat = false;
        }
        System.out.println("Du har överstig antal tal!");
    }

    static void input() {

        System.out.print("\nSkriv ett text: ");
        word = scan.nextLine();

        System.out.print("Skriv ett tal: ");
        number = scan.nextInt();
        scan.nextLine();
    }
}
