
public class addBinary {

    public static void main(String[] args) {

        String a = "11";
        String b = "1";

        char carry = '0';

        int i = a.length() - 1;

        int j = b.length() - 1;

        // ArrayList<Character> al = new ArrayList<>();

        StringBuilder al = new StringBuilder();

        while (i >= 0 && j >= 0) {

            int ans = a.charAt(i) - '0' + b.charAt(j) - '0' + carry - '0';

            int sum = ans % 2;

            carry = (char) (ans / 2 + '0');

            al.append((char) (sum + '0'));

            i--;
            j--;
        }

        while (i >= 0) {

            int ans = a.charAt(i) - '0' + carry - '0';

            int sum = ans % 2;

            carry = (char) (ans / 2 + '0');

            // al.add((char) (sum + '0'));

            al.append((char) (sum + '0'));

            i--;
        }

        while (j >= 0) {

            int ans = b.charAt(j) - '0' + carry - '0';

            int sum = ans % 2;

            carry = (char) (ans / 2 + '0');

            // al.add((char) (sum + '0'));
            al.append((char) (sum + '0'));

            j--;
        }

        if (carry == '1') {
            al.append(carry);
        }

        al.reverse();

        System.out.println(al);

        String ans = al.toString();

        System.out.println(ans);
    }
}
