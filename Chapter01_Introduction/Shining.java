/*
 * Created by nphau on 06/01/2022, 09:50
 * Copyright (c) 2022. All rights reserved.
 * Last modified 06/01/2022, 09:50
 */
package Chapter01_Introduction;
/**
 * Write a program in a class named Shining that prints the following line of output 1000 times:
 * All work and no play makes Jack a dull boy.
 * You should not write a program whose source code is 1000 lines long;
 * use methods to shorten the program. What is the shortest program
 * you can write that will produce the 1000 lines of output,
 * using only the material from Chapter 1 (println, methods, etc.)?
 */
public class Shining {
    public static void main(String[] args) {
		printFiveHundred();
		printFiveHundred();	
	}
	public static void printFiveHundred() {
		printHundred();
		printHundred();
		printHundred();
		printHundred();
		printHundred();
	}
	public static void printHundred() {
		printTowenty();
		printTowenty();
		printTowenty();
		printTowenty();
		printTowenty();
	}
    public static void printTowenty() {
        printFive();
        printFive();
        printFive();
        printFive();
    }
    public static void printFive() {
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
    }
}