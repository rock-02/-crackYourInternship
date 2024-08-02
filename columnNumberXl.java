public class columnNumberXl {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            char c = (char) ('A' + columnNumber % 26);
            res.insert(0, c);
            columnNumber /= 26;
        }
        return res.toString();
    }
}
