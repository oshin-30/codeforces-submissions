import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[s.length()/2 + 1];
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i = 0;i < s.length();i += 2){
            arr[idx++] = s.charAt(i) - '0';
        }
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++){
            sb.append(arr[i]);
            if(i != arr.length - 1){
                sb.append("+");
            }
        }
        System.out.println(sb.toString());
    }
}
