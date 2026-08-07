import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String reversed = new String(arr);
        if(reversed.equals(t)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
