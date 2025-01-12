class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) return false;

        int openCount = 0;
        int flexibleCount = 0;

        // Left-to-right pass
        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0') {
                flexibleCount++;
            } else if (s.charAt(i) == '(') {
                openCount++;
            } else { // s.charAt(i) == ')'
                if (openCount > 0) {
                    openCount--;
                } else if (flexibleCount > 0) {
                    flexibleCount--;
                } else {
                    return false;
                }
            }
        }

        int closeCount = 0;
        flexibleCount = 0;

        // Right-to-left pass
        for (int i = n - 1; i >= 0; i--) {
            if (locked.charAt(i) == '0') {
                flexibleCount++;
            } else if (s.charAt(i) == ')') {
                closeCount++;
            } else { // s.charAt(i) == '('
                if (closeCount > 0) {
                    closeCount--;
                } else if (flexibleCount > 0) {
                    flexibleCount--;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
