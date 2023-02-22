/*
Given an integer x, return true if x is a palindrome, and false otherwise.
*/
package LeetCode;

import java.util.Collections;

public class isPalindromee {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int rev = 0;
        int check = x;
        while (check != 0) {
            int temp = check % 10;
            rev = rev * 10 + temp;
            check /= 10;
        }
        return x == rev;
        }
    }
