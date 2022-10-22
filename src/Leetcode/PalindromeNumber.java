package Leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println(isPalindrome(12421421));
    }

    public static boolean isPalindrome(int x) {
        String convertedNumber = String.valueOf(x);
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(convertedNumber);
        reverseString.reverse();
        return (reverseString.toString()).equals(convertedNumber);
    }
}
