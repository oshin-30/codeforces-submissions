import java.util.*;
public class Main {
    static class Friend {
        long money;
        long friendship;
        Friend(long money, long friendship) {
            this.money = money;
            this.friendship = friendship;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        Friend[] friends = new Friend[n];
        for (int i = 0; i < n; i++) {
            long m = sc.nextLong();
            long s = sc.nextLong();
            friends[i] = new Friend(m, s);
        }
        Arrays.sort(friends, Comparator.comparingLong(f -> f.money));
        long sum = 0;
        long answer = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            sum += friends[right].friendship;
            while (friends[right].money - friends[left].money >= d) {
                sum -= friends[left].friendship;
                left++;
            }
            answer = Math.max(answer, sum);
        }
        System.out.println(answer);
    }
}
