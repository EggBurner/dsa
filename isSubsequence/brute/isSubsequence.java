package isSubsequence.brute;

class isSubsequence {
    public static boolean isSubsequenceFunction(String s, String t) {

        int n = 0;
        int m = 0;

        while (n < s.length()&&m < t.length()) {

            if (s.charAt(n)==t.charAt(m)) {
                n++;
            }
            m++;
        }

        return n==s.length();
    }

    public static void main(String[] args) {


        boolean n = isSubsequenceFunction("abc", "abcdef");
        System.out.println(n);
    }
}