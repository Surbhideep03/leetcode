class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();

        remove(s, 0, 0, new char[]{'(', ')'}, ans);

        return ans;
    }

    public void remove(String s, int start, int check, char[] par, List<String> ans) {
        int count = 0;

        for (int i = check; i < s.length(); i++) {
            if (s.charAt(i) == par[0]) {
                count++;
            }

            if (s.charAt(i) == par[1]) {
                count--;
            }

            if (count >= 0) {
                continue;
            }

            for (int j = start; j <= i; j++) {
                if (s.charAt(j) == par[1] &&
                    (j == start || s.charAt(j - 1) != par[1])) {

                    remove(s.substring(0, j) + s.substring(j + 1),
                           j, i, par, ans);
                }
            }

            return;
        }

        String reversed = new StringBuilder(s).reverse().toString();

        if (par[0] == '(') {
            remove(reversed, 0, 0, new char[]{')', '('}, ans);
        } else {
            ans.add(reversed);
        }
    }
}