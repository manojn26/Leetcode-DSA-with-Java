
public class Solution {
    public boolean palindromeNumber(int x) {
        // negative numbers are not a palindrome
        if (x < 0)
            return false;

        // store given into the temporary variable.
        int temp = x;
        // declare a variable for reversed number
        long reversed = 0;

        // loop through when the temp is != 0
        while (temp != 0) {
            // getting last digit of a number
            int digit = (int) temp % 10;
            // add that digit to the reversed number as reversed * 10 + digit
            reversed = reversed * 10 + digit;
            // remove last digit of a number
            temp /= 10;
        }

        // checking the palindrome
        return (x == reversed);

    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(new Solution().palindromeNumber(x));

    }
}
