public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            int g = guess(mid);

            if (g == 0) {
                return mid;
            }
            else if (g == 1) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return -1;
    }
}