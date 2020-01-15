public class total_routes {

    public static int runningSum = 0;

    public static void recurse(int n, int m, int row, int col) {
        if (row == n && col == m) {
            runningSum++;
            return;
        } else if (row > n || col > m) {
            return;
        } else {
            recurse(n, m, row, col + 1);
            recurse(n, m, row + 1, col);
            return;
        }
    }

    public static int find_total_routes(int n, int m) {
        recurse(n, m, 1, 1);
        return runningSum;
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        System.out.println(find_total_routes(n, m));
    }
}