/*
 * Created by nphau on 06/01/2022, 09:50
 * Copyright (c) 2022. All rights reserved.
 * Last modified 06/01/2022, 09:50
 */
package Chapter07_Arrays;

/**
 * Write a static method named isSorted that accepts an array of doubles as a parameter 
 * and returns true if the list is in sorted (nondecreasing) order and false otherwise.
 * For example, if arrays named list1 and list2 store {16.1, 12.3, 22.2, 14.4} and {1.5, 4.3, 7.0, 19.5, 25.1, 46.2} respectively, the calls isSorted(list1) and isSorted(list2)
 * should return false and true respectively. Assume the array has at least one element.
 * A one-element array is considered to be sorted.
 */
public class IsSorted {

    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter7/e4-isSorted
    public boolean isSorted(double[] arr) {
        for(int i = 0; i <= arr.length - 2; i++) {
            if(arr[i + 1] < arr[i])
                return false;
        }
        return true;
    }
    
}