import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        y++;
        while (true) {
            String s = String.valueOf(y);
            HashSet<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                set.add(c);
            }
            if (set.size() == 4) {
                System.out.println(y);
                break;
            }
            y++;
        }
    }
}
