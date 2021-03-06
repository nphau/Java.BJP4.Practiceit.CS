/*
 * Created by nphau on 06/01/2022, 09:50
 * Copyright (c) 2022. All rights reserved.
 * Last modified 06/01/2022, 09:50
 */
package Chapter02_PrimitiveDataAndDefiniteLoops;

/**
 * It's common to print a rotating, increasing list of single-digit numbers at the start of a 
 * program's output as a visual guide to number the columns of the output to follow.
 * With this in mind, write nested for loops to produce the following output, with each line 60 characters wide:
 *          |         |         |         |         |         |
 * 123456789012345678901234567890123456789012345678901234567890
 */
public class NumbersOutput60 {
    
    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter2/e10-numbersOutput60
    public static void numbersOutput60(){
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }

        System.out.println();

        for (int i = 1; i <= 6; i++) {
            System.out.print("1234567890");
        }
    }
}
