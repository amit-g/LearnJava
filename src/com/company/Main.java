package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = sc.next();
        System.out.println("Hello " + name);
    }
}