package intro.through_the_fog;
/*
You have deposited a specific amount of money into your bank account.
Each year your balance increases at the same growth rate.
With the assumption that you don't make any additional deposits,
find out how long it would take for your balance to pass a specific threshold.

Example

For deposit = 100, rate = 20, and threshold = 170, the output should be
depositProfit(deposit, rate, threshold) = 3.

Each year the amount of money in your account increases by 20%. So throughout the years, your balance would be:

year 0: 100;
year 1: 120;
year 2: 144;
year 3: 172.8.
Thus, it will take 3 years for your balance to pass the threshold, so the answer is 3.


 */
public class DepositProfit {
    static int depositProfit(int deposit, int rate, int threshold) {
        int count = 0;
        double sum = deposit;
        int oneHundred = 100;
        do {
            sum = sum + ((sum / oneHundred) * rate);
            count++;
        } while (sum < threshold);
        return count;
    }

    public static void main(String[] args) {
        int deposit = 100;
        int rate = 20;
        int threshold = 170;
        System.out.println(depositProfit(deposit,rate,threshold));
    }
}
