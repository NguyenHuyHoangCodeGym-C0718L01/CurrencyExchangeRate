package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        long rate = 23000;

        System.out.println();
        System.out.print("Insert USD: ");
        long usd = scanner.nextLong();

        System.out.println();
        System.out.print("VND: ");
        System.out.print(usd*rate);
    }
}
