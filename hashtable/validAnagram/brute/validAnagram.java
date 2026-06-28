package hashtable.validAnagram.brute;

import java.util.Arrays;

class validAnagram {
    public static boolean validAnagramF(String s, String t) {

        if (s.length() !=t.length()) {
            return false;
        }
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);

        return Arrays.equals(sarr, tarr);
    }
    public static void main(String[] args) {
        System.out.println(validAnagramF("anagram", "nagaram"));
    }
}