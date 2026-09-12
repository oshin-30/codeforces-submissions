import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int drinks = k * l / nl;
        int limeSlices = c * d;
        int salt = p / np;
        int toasts = Math.min(drinks, Math.min(limeSlices, salt));
        System.out.println(toasts / n);
    }
}
