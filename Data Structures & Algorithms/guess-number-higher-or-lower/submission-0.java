/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        // num -> number I choose
        // 0 - Equal to the guess
        // -1 - Guess is lesser
        // 1 - Guess is greater
        // range is from  1 to int value;

        int low = 1;
        int high = Integer.MAX_VALUE;
        int mid = low + (high - low) / 2;
        int grace;
        while (low < high) {
            mid = low + (high - low) / 2;
            grace = guess(mid);
            if (grace == 0) {
                break;
            } else if (grace > 0) {
                // guess is greater than mid
                low = mid;
            } else {
                // guess is lower than mid
                high = mid;
            }
        }
        return mid;
    }
}