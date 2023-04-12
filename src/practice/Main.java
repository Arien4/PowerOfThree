package practice;

// Given an integer n, return true if it is a power of three. Otherwise, return false.
// An integer n is a power of three, if there exists an integer x such that n == 3x.

// Example 1:
// Input: n = 27
// Output: true
// Explanation: 27 = 33
// Example 2:
// Input: n = 0
// Output: false
// Explanation: There is no x where 3x = 0.
// Example 3:
// Input: n = -1
// Output: false
// Explanation: There is no x where 3x = (-1).

// Constraints:
// -231 <= n <= 231 - 1

// Follow up: Could you solve it without loops/recursion?
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 10000; i = i * 3) System.out.println(i + " " + Integer.toBinaryString(i));
    }

    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int
        return (n > 0 && 1162261467 % n == 0);
        // it works because 3 is a simple number
    }
}
