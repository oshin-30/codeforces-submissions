import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        int max = 0;
        String winner = "";
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                winner = entry.getKey();
            }
        }
        System.out.println(winner);
    }
}
