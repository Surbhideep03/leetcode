class Solution {
    public long countCommas(long n) {
        long ans = 0;

        // 1,000 and above -> 1st comma
        if (n >= 1_000L) {
            ans += n - 999L;
        }

        // 1,000,000 and above -> 2nd comma
        if (n >= 1_000_000L) {
            ans += n - 999_999L;
        }

        // 1,000,000,000 and above -> 3rd comma
        if (n >= 1_000_000_000L) {
            ans += n - 999_999_999L;
        }

        // 1,000,000,000,000 and above -> 4th comma
        if (n >= 1_000_000_000_000L) {
            ans += n - 999_999_999_999L;
        }

        // 1,000,000,000,000,000 -> 5th comma
        if (n >= 1_000_000_000_000_000L) {
            ans += n - 999_999_999_999_999L;
        }

        return ans;
    }
}