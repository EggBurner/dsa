package twoPointer.reverseString.optimal;

class reverseString {
    public static void reverseStringF(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        reverseStringF(new char[]{'a','b','d','u','l','l', 'a', 'h'});
    }
}
