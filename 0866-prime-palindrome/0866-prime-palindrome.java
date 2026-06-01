class Solution {

    public int primePalindrome(int n) {

        if (n >= 8 && n <= 11)
            return 11;

        for (int i = 1; i < 100000; i++) {

            String s = Integer.toString(i);

            String rev = new StringBuilder(s)
                    .reverse()
                    .substring(1);

            int palindrome = Integer.parseInt(s + rev);

            if (palindrome >= n && isPrime(palindrome))
                return palindrome;
        }

        return -1;
    }

    public boolean isPrime(int n) {

        if (n < 2)
            return false;

        if (n % 2 == 0)
            return n == 2;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}