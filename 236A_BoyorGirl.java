import java.util.*;
public class Main{
    public static void main(String[] args){
        HashSet<Character> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        for(int i = 0;i < name.length();i++){
            hs.add(name.charAt(i));
        }
        if(hs.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
