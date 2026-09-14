import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] home = new int[101];
        int[] guest = new int[101];
        for (int i = 0; i < n; i++) {
            home[sc.nextInt()]++;
            guest[sc.nextInt()]++;
        }
        int ans = 0;
        for (int color = 1; color <= 100; color++) {
            ans += home[color] * guest[color];
        }
        System.out.println(ans);
    }
}
