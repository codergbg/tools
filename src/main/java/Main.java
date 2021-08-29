/**
 * @author gubengang
 * @create 2021-08-14 8:36
 */
public class Main {
    public int getLucky(String s, int k) {
        if (s == null || s.length() == 0 || k < 1) {
            return 0;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            sb.append(ch - 'a' + 1);
        }
        for (int i = 1; i <= k; i++) {
            int sum = getSum(sb.toString());
            sb.delete(0, sb.length());
            sb.append(sum);
        }
        return Integer.parseInt(sb.toString());
    }

    private int getSum(String sb) {
        int sum = 0;
        for (char ch : sb.toCharArray()) {
            sum += ch - '0';
        }
        return sum;
    }

    public String maximumNumber(String num, int[] change) {
        if (num == null || num.length() == 0) {
            return "0";
        }

        char[] ches = num.toCharArray();
        boolean canGo = false;
        for (int i = 0; i < ches.length; i++) {
            int n = ches[i] - '0';
            if (canGo && n > change[n]) {
                break;
            }

            if (n < change[n]) {
                ches[i] = (char) (change[n]+'0');
                canGo = true;
            }
        }

        return String.valueOf(ches);
    }
}
