package com.company;

import java.util.Scanner;

public class Main {

    static String word = "";
    static int number = (int)(1+Math.random()*10);

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv ett text: ");
        word = scan.nextLine();

        System.out.print("Skriv ett tal: ");
        number = scan.nextInt();

        while (number <= 10){
            System.out.println(word);
            number++;
        }
    }
}
