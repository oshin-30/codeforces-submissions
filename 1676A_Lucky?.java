import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int first = 0, last = 0;
            for (int i = 0; i < 3; i++) {
                first += s.charAt(i) - '0';
            }
            for (int i = 3; i < 6; i++) {
                last += s.charAt(i) - '0';
            }
            System.out.println(first == last ? "YES" : "NO");
        }
        sc.close();
    }
}
