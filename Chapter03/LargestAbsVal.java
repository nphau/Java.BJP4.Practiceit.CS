package Chapter03;
/**
 * Write a method largestAbsVal that accepts three integers as parameters and returns the largest of their three absolute values.
 * For example, a call of largestAbsVal(7, -2, -11) would return 11, and a call of largestAbsVal(-4, 5, 2) would return 5.
 */
public class LargestAbsVal {
    // https://practiceit.cs.washington.edu/problem/view/bjp4/chapter3/e7-largestAbsVal
    public static int largestAbsVal(int a, int b, int c){
        return Math.max(Math.max(Math.abs(a),Math.abs(b)),Math.abs(c));
    }
}
