import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int officers = 0;
        int untreated = 0;
        for (int i = 0; i < n; i++) {
            int event = sc.nextInt();
            if (event > 0) {
                officers += event;
            } else {
                if (officers > 0) {
                    officers--;
                } else {
                    untreated++;
                }
            }
        }
        System.out.println(untreated);
        sc.close();
    }
}
