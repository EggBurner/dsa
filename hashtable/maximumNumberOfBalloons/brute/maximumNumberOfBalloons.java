package hashtable.maximumNumberOfBalloons.brute;

class maximumNumberOfBalloons{
    public static int maxNumberOfBalloonsF(String text) {

        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == 'b') b++;
            else if(c == 'a') a++;
            else if (c == 'l') l++;
            else if(c == 'o') o++;
            else if (c == 'n') n++;
        }
        l /= 2;
        o /= 2;
        return Math.min(Math.min(b, a),Math.min(Math.min(l, o),n));
    }



    public static void main(String[] args) {


      int result = maxNumberOfBalloonsF("balloonnoollab");

        System.out.println(result);
    }
}
