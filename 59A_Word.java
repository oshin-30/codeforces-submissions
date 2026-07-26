import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int upper = 0;
        int lower = 0;
        for(int i = 0;i < s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                upper++;
            }else{
                lower++;
            }
        }
        if(upper > lower){
            s = s.toUpperCase();
        }else{
            s = s.toLowerCase();
        }
        System.out.println(s);
    }
}
