public class SquareRoot {
    public static int sqrt(int x) {
        if (x == 0)
            return 0;

        int left = 1;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sqrt = x / mid;

            if (sqrt == mid) {
                return mid;
            } else if (sqrt < mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        int x1 = 4;
        int x2 = 8;

        System.out.println("Square root of " + x1 + ": " + sqrt(x1));
        System.out.println("Square root of " + x2 + ": " + sqrt(x2));
    }
}
