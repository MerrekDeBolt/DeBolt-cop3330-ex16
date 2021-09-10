package org.example;

/*
 *  UCF COP3330 Fall 2021 Exercise 16 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        String input;
        int age, drivingAge = 16;
        boolean canDrive;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age? ");
        input = scanner.nextLine();

        age = Integer.parseInt(input);

        System.out.println(age >= drivingAge ? "You are old enough to legally drive." : "You are not old enough to legally drive.");
    }
}