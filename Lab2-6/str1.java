public class str1 {
    public static void main(String[] args) {

        String s = new String("a7B9kL2mPq 8Xr5tY1z N4vWc3 sJ0dEoMf6 gHb");

        System.out.print(s);

        int k6 = 0, dl = 0;

        for (int i = 0; i < s.length(); i++) {
            dl = 0;

            while (i < s.length() && s.charAt(i) != ' ') {
                i++;
                dl++;
            }

            System.out.print("\nlong = " + dl);

            if (dl == 6) 
                k6++;
        }

        System.out.print("\nGreater then 6 chars: " + k6);
    }
}
