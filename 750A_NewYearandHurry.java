import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int solved = 0;
        int sum = 0;
        for(int i = 1;i <= n;i++){
            sum += 5*i;
            if(k + sum <= 240){
                solved++;
            }else{
                break;
            }
        }
        System.out.println(solved);
    }
}
