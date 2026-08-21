import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String prev = sc.next();
        int count = 1;
        for(int i = 1;i < n;i++){
            String s = sc.next();
            if(!s.equals(prev)){
                count++;
            }
            prev = s;
        }
        System.out.println(count);
    }
}
