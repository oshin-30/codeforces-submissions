import java.util.Scanner;
public class Main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int x = sc.nextInt();
        while(x > 0){
            if(x >= 5){
                x -= 5;
            }
            else{
                x = 0;
            }
            min++;
        }
        System.out.println(min);
    }
}
