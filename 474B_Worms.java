import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prefix = new int[n];
        prefix[0] = sc.nextInt();
        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + sc.nextInt();
        }
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            int worm = sc.nextInt();
            int left = 0;
            int right = n - 1;
            while(left < right) {
                int mid = left + (right - left) / 2;
                if(prefix[mid] >= worm) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            System.out.println(left + 1);
        }
    }
}
