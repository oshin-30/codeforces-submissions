import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLowerCase(s.charAt(i))) {
                hs.add(s.charAt(i));
            }
        }
        System.out.println(hs.size());
    }
}
