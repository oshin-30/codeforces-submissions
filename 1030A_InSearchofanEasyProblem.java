import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hard = false;
        for(int i = 0;i < n;i++){
            int p = sc.nextInt();
            if(p == 1){
                hard = true;
                break;
            }
        }
        if(hard){
            System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }
    }
}
