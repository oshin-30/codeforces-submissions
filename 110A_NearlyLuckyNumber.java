import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        String s = Long.toString(n);
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '4' || s.charAt(i) == '7'){
                count++;
            }
        }
        String countStr = Integer.toString(count);
        boolean lucky = true;
        for(int i = 0;i < countStr.length();i++){
            if(countStr.charAt(i) != '4' && countStr.charAt(i) != '7'){
                lucky = false;
                break;
            }
        }
        if(lucky){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
