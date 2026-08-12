import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next().toLowerCase();
        char[] arr = new char[26];
        for(int i = 0;i < s.length();i++){
            arr[s.charAt(i) - 'a']++;
        }
        boolean pangram = true;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] < 1){
                pangram = false;
                break;
            }
        }
        if(pangram){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
