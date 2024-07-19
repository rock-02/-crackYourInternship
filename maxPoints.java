public class maxPoints {
    public int maxScore(int[] cardPoints, int k) {

        int i = 0;
        int j = cardPoints.length - 1;

        int n = cardPoints.length;

        int ls = 0;
        int rs = 0;
        int ms = 0;

        int c = 0;

        while (c < k) {
            ls += cardPoints[i++];
            c++;
        }
        c = 0;
        ms = ls;
        i = k - 1;
        while (c < k) {
            ls -= cardPoints[i];
            i--;
            rs += cardPoints[j];
            j--;
            c++;
            ms = Math.max(ls + rs, ms);

        }

        return ms;
    }
}
