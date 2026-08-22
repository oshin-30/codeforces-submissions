import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long best = Long.MAX_VALUE;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(st.nextToken());
            long rounds = (a - i + n - 1) / n;
            if (rounds < best) {
                best = rounds;
                answer = i;
            }
        }
        System.out.println(answer + 1);
    }
}
