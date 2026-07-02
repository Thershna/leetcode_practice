class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        StringBuilder sr = new StringBuilder();

        int n = s.length();

        for (int i = n - 1; i >= 0; i--) {
            sr.append(s.charAt(i));
        }

        return sr.toString().equals(s);
    }
}