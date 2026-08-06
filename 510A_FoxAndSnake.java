import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean right = true;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            } else {
                if (right) {
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                } else {
                    System.out.print("#");
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                }
                right = !right;
            }
            System.out.println();
        }
    }
}
