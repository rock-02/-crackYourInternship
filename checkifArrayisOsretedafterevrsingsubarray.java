import java.util.Arrays;

public class checkifArrayisOsretedafterevrsingsubarray {

    public static boolean checknumber(int a[]) {

        int n = a.length;

        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
        }

        Arrays.sort(temp);

        int front;
        int back;

        for (front = 0; front < n; front++) {
            if (a[front] != temp[front]) {
                break;
            }
        }

        for (back = n - 1; back >= 0; back--) {
            if (a[back] != temp[back]) {
                break;
            }
        }

        if (front >= back) {
            return true;
        }

        System.out.println(front + " " + back);
        for (int i = front; i <= back; i++) {
            System.out.println(a[i]);
        }

        for (int i = front + 1; i <= back; i++) {
            if (a[i] > a[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int a[] = { 1, 2, 4, 5, 3 };

        System.out.println(checknumber(a));

    }
}
