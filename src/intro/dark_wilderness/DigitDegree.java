package intro.dark_wilderness;
/*
Let's define digit degree of some positive integer as
the number of times we need to replace this number with
the sum of its digits until we get to a one digit number.

Given an integer, find its digit degree.

Example

For n = 5, the output should be
digitDegree(n) = 0;
For n = 100, the output should be
digitDegree(n) = 1.
1 + 0 + 0 = 1.
For n = 91, the output should be
digitDegree(n) = 2.
9 + 1 = 10 -> 1 + 0 = 1.
 */
public class DigitDegree {
    public static void main(String[] args) {
        int n = 304;
        System.out.println(digitDegree(n));
    }

    private static int digitDegree(int n) {
        if (n < 10) return 0;

        int num = 0;
        while (n != 0) {
            num += n % 10;
            n /= 10;
        }
        return 1 + digitDegree(num);
    }
}
