class Solution {
    public int distinctSubseqII(String s) {
        final int MOD = 1_000_000_007;

        long[] last = new long[26];
        long total = 0;

        for (char c : s.toCharArray()) {
            int index = c - 'a';

            long add = (total - last[index] + 1 + MOD) % MOD;

            total = (total + add) % MOD;
            last[index] = (last[index] + add) % MOD;
        }

        return (int) total;
    }
}