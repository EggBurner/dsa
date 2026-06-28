package twoPointer.validPalindrome.brute;

class validPalindrome {
    public static boolean validPalindromeF(String s) {
        StringBuilder cleaned = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String original = cleaned.toString();
        String reversed = cleaned.reverse().toString();
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(validPalindromeF("Ali"));
    }
}